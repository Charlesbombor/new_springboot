package com.vixlab.bootcamp.bootcampsbforum.infra;

public class BusinessException extends Exception{
  private String code;

  BusinessException(Syscode syscode){
    super(syscode.getMessage());
    this.code = syscode.getCode();
  }
}
