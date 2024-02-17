package com.vixlab.bootcamp.bootcampsbforum.infra;

import lombok.Getter;
@Getter

public enum Syscode {

OK("000000", "OK."), //
NOTFOUND("1")

  private String code;
  private String message;

  private Syscode(String code, String message){
    this.message = message;
  }


}
