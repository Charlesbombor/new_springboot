package com.vixlab.bootcamp.bccryptocoingecko.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientException;
import com.vixlab.bootcamp.bccryptocoingecko.infra.ApiResponse;
import com.vixlab.bootcamp.bccryptocoingecko.infra.NullPointer;
import com.vixlab.bootcamp.bccryptocoingecko.infra.ResourceNotFound;
import com.vixlab.bootcamp.bccryptocoingecko.infra.Syscode;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(RestClientException.class) // catch
  @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT) // TBC.
  public ApiResponse<Void> restClientExceptionHandler(RestClientException e) {
    return ApiResponse.<Void>builder() //
        .code(Syscode.REST_CLIENT_EXCEPTION.getCode()) //
        .message(Syscode.REST_CLIENT_EXCEPTION.getMessage()) //
        .build();
  }

  @ExceptionHandler(NullPointer.class)
  @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
  public ApiResponse<Void> npeExceptionHandler(NullPointer e) {
    return ApiResponse.<Void>builder() //
        .code(Syscode.NPE_EXCEPTION.getCode()) //
        .message(Syscode.NPE_EXCEPTION.getMessage()) //
        .build();
  }

@ExceptionHandler(ResourceNotFound.class)
@ResponseStatus(value = HttpStatus.OK)
public ApiResponse<Void> npeExceptionHandler(ResourceNotFound e) {
  return ApiResponse.<Void>builder() //
      .code(Syscode. NOTFOUND.getCode()) //
      .message(Syscode. NOTFOUND.getMessage()) //
      .build();
}



  

}
