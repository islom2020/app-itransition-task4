package com.example.itransitiontask4.exception.customException;


public class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(String message) {
        super(message);
    }
}
