package com.example.messageservice.domain.exception;

public class MessangerServiceException extends RuntimeException {

    public MessangerServiceException(String message) {
        super(message);
    }

    public MessangerServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
