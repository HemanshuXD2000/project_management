package com.example.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.model.ErrorResponseModel;

@ControllerAdvice
public class RecordExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponseModel> handleRecordNotFoundException(RecordNotFoundException e){
		ErrorResponseModel error = new ErrorResponseModel();
		error.setErrorTime(System.currentTimeMillis());
		error.setErrorMessage(e.getMessage());
		error.setErrorCode(404);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		
	}
}
