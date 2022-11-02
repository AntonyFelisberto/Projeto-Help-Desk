package com.antony.helpdesk.handler;

import com.antony.helpdesk.erros.StandardError;
import com.antony.helpdesk.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerExceptions {

//    @ExceptionHandler(NotFoundException.class)
//    public ResponseEntity<StandardError> notFoundException(NotFoundException exception){
//        StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND,exception.getMessage());
//    }

}
