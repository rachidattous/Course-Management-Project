package com.add.courseManagement.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
@Slf4j
public class ApiExceptionHandler {

  @ExceptionHandler(value = { ApiException.class })
  public ResponseEntity<Object> handleApiException(ApiException e) {

    HttpStatus badRequest = HttpStatus.BAD_REQUEST;
    ApiRequestException apiException = new ApiRequestException(e.getMessage(), badRequest,
        ZonedDateTime.now(ZoneId.of("Z")));

    log.error(e.getMessage());

    return new ResponseEntity<>(apiException, badRequest);

  }
}
