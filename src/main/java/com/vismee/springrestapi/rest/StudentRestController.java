package com.vismee.springrestapi.rest;

import com.vismee.springrestapi.customexception.StudentNotFoundException;
import com.vismee.springrestapi.entity.Student;
import jakarta.annotation.PostConstruct;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
    List<Student> students;

    // use case of @PostConstruct .. to load the data only once when the bean is constructed
    @PostConstruct
    public void loadData()
    {
       students = new ArrayList<>();
       students.add(new Student("Sooriya","Meenakshi"));
       students.add(new Student("Bhargav","Visu"));
       students.add(new Student("Dijesh","Sabari"));
    }

    // Returns list of students - Jackson automatically converts List<Student> object to JSON array
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return students;
    }

    // Retrieving a student based on id - if student is not found for the id, throws custom exception
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        if (studentId >= students.size() || studentId < 0)
            throw new StudentNotFoundException("Student not found for the id " + studentId);

        return students.get(studentId);
    }

}
