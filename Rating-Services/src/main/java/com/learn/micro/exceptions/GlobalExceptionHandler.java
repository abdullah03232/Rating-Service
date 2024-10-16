package com.learn.micro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.learn.micro.responses.APIResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFound.class)
	ResponseEntity<APIResponse> resourceNotFoundException(ResourceNotFound resource){
		String message = resource.getMessage();
		APIResponse response = APIResponse.builder().message(message).success(false).httpStatus(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
}
