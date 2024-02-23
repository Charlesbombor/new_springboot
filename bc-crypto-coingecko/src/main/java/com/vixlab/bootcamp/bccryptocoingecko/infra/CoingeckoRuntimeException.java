package com.vixlab.bootcamp.bccryptocoingecko.infra;

import lombok.Getter;


  @Getter
public class CoingeckoRuntimeException extends RuntimeException {

  private String code;

  public CoingeckoRuntimeException(Syscode syscode) {
    super(syscode.getMessage());
    this.code = syscode.getCode();
  }

}
