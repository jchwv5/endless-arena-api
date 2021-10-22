package com.lessthanzero.oio.exceptions;

/**
 * A custom exception for conflict errors.
 */
public class ConflictException extends RuntimeException {
    public ConflictException() {
    }

    public ConflictException(String message) {
        super(message);
    }
}
