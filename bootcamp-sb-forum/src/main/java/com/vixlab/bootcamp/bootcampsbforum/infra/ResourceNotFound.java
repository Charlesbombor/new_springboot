package com.vixlab.bootcamp.bootcampsbforum.infra;

public class ResourceNotFound extends BusinessException{
  public ResourceNotFound(Syscode syscode){
    super(syscode);
  }
}
