package com.lessthanzero.oio.exceptions;

/**
 * A custom exception for a bad request.
 */
public class BadRequest extends RuntimeException {

  public BadRequest() {
  }

  public BadRequest(String message) {
    super(message);
  }
}