package com.vixlab.bootcamp.bootcampsbforum.infra;

public enum Scheme {
  HTTPS, HTTP,;

  public String lowercaseName(){
    return this.name().toLowerCase();
  }
}
