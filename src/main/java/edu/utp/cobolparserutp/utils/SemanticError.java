package edu.utp.cobolparserutp.utils;

public class SemanticError {
  String identifier;
  String reason;

  public SemanticError(String identifier, String reason) {
    this.identifier = identifier;
    this.reason = reason;
  }
}
