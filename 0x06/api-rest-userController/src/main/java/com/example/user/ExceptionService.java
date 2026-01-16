package com.example.user;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.user.exception.UserIdException;
import com.example.user.exception.UserNameException;
import com.example.user.exception.CPFException;
import com.example.user.exception.UserErrorResponse;

@ControllerAdvice
public class ExceptionService {
    @ExceptionHandler(value = {UserIdException.class, UserNameException.class, CPFException.class})
    ResponseEntity<UserErrorResponse> handleException(Exception exception) {
        UserErrorResponse userErrorResponse = new UserErrorResponse();

        userErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        userErrorResponse.setMessage(exception.getMessage());

        return new ResponseEntity(userErrorResponse, HttpStatus.NOT_FOUND);
    }
}