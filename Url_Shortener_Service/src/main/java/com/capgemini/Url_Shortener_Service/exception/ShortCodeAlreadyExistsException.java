package com.capgemini.Url_Shortener_Service.exception;

public class ShortCodeAlreadyExistsException extends RuntimeException {
    public ShortCodeAlreadyExistsException(String message) {
        super(message);
    }
}