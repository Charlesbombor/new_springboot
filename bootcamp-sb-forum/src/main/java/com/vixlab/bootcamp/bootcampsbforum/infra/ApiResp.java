package com.vixlab.bootcamp.bootcampsbforum.infra;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter

public class ApiResp<T> {

  private String code;

  private String message;

  private T data;
}
