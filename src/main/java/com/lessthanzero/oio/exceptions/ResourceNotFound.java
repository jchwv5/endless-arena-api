package com.lessthanzero.oio.exceptions;

/**
 * A custom exception for resource not found.
 */
public final class ResourceNotFound extends RuntimeException {
  public ResourceNotFound() {
  }

  public ResourceNotFound(String message) {
    super(message);
  }
}
