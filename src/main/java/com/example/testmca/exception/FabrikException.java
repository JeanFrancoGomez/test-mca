package com.example.testmca.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class FabrikException extends RuntimeException {
    public FabrikException(String message) {
        super(message);
    }
}
