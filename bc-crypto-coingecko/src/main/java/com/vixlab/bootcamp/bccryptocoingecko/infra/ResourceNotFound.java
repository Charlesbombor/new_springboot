package com.vixlab.bootcamp.bccryptocoingecko.infra;

public class ResourceNotFound extends CoingeckoRuntimeException {

  public ResourceNotFound(Syscode syscode) {
    super(syscode);
    
  }
  
}
