package com.example.assignment11.exception;


public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public BusinessException(String message) {

        super(message);
    }
}
