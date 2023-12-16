package com.vismee.springrestapi.exceptionpojo;

/* Custom error response class .. This is the format of response sent back to the client
   when we throw the exception .. Jackson handles conversion of POJO object to JSON */
public class StudentErrorResponse
{
    private int status;
    private String message;
    private long timestamp;

    public StudentErrorResponse()
    {

    }

    public StudentErrorResponse(int status, String message, long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
