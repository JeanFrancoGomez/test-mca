package com.example.testmca.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class AmountException extends RuntimeException {
    public AmountException(String message) {
        super(message);
    }
}
