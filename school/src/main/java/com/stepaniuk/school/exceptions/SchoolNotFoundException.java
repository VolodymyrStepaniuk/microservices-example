package com.stepaniuk.school.exceptions;

public class SchoolNotFoundException extends RuntimeException{
    public SchoolNotFoundException(){
        super("No school found");
    }
    public SchoolNotFoundException(String message){
        super(message);
    }
    public SchoolNotFoundException(Throwable throwable){
        super(throwable);
    }
}
