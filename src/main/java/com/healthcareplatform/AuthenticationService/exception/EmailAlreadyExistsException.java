package com.healthcareplatform.AuthenticationService.exception;

public class EmailAlreadyExistsException extends RuntimeException {
  public EmailAlreadyExistsException(String email) {
    super("Email '%s' is already in use.".formatted(email));
  }
}