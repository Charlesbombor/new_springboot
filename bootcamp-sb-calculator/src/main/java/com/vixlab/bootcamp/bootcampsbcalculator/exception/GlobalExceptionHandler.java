package com.vixlab.bootcamp.bootcampsbcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.vixlab.bootcamp.bootcampsbcalculator.infra.ApiResponse;
import com.vixlab.bootcamp.bootcampsbcalculator.infra.InvalidInputException;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(InvalidInputException.class)
  @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
  public ApiResponse<Void> InvalidInputExceptionHandler (InvalidInputException e){
    return ApiResponse.<Void>builder()  //
      .code(e.getCode()) //
      .message(e.getMessage())
      .data(null)  //
      .build();
  }
  
}
