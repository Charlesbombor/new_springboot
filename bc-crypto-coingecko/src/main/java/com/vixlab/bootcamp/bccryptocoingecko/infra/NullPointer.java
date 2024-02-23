package com.vixlab.bootcamp.bccryptocoingecko.infra;

import lombok.Getter;

@Getter
public class NullPointer extends NullPointerException {


  private String code;

  public NullPointer(Syscode syscode) {

    super(syscode.getMessage());
    this.code = syscode.getCode();
  }

}


