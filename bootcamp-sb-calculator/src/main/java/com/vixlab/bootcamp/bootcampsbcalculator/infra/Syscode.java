package com.vixlab.bootcamp.bootcampsbcalculator.infra;

import lombok.Getter;

@Getter
public enum Syscode {
  
  INVAILD_INPUT("9", "Invaild Input");

  private String code;
  private String message;

  private Syscode(String code, String message) {
    this.code = code;
    this.message = message;
  }
}
