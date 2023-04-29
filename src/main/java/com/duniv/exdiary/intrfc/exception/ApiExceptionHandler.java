package com.duniv.exdiary.intrfc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({ ApiException.class })
    protected ResponseEntity apiExceptionHandler(ApiException e){
        return new ResponseEntity(new ApiErrorDTO(e.getCode()), HttpStatus.OK);
    }

}
