package com.stepaniuk.student.exceptions;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(){
        super("No student found");
    }
    public StudentNotFoundException(String message){
        super(message);
    }
    public StudentNotFoundException(Throwable throwable){
        super(throwable);
    }
}
