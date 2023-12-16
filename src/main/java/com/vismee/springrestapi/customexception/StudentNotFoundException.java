package com.vismee.springrestapi.customexception;

public class StudentNotFoundException extends RuntimeException
{
    public StudentNotFoundException(String message) {
        super(message);
    }
}
