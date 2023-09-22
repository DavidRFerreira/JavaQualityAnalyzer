package org.davidrferreira.exceptions;

public class MissingArtefactException extends RuntimeException {

  public MissingArtefactException(String errorMessage) {
    super(errorMessage);
  }
}
