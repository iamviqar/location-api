package com.hqv.location.restapi.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hqv.location.exception.RecordNotFoundException;
import com.hqv.location.exception.UniqueRecordException;
import com.hqv.location.pojo.ErrorResponse;


@ControllerAdvice
public class RestExceptionHandler {

	// Add an exception handler using @ExceptionHandler

	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleException(RecordNotFoundException exc) {

		// create CustomerNotFoundException
		ErrorResponse error = new ErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		// return ResponseEntity
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);

	}
	
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleException(UniqueRecordException exc) {

		// create CustomerNotFoundException
		ErrorResponse error = new ErrorResponse();
		error.setStatus(HttpStatus.CONFLICT.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		// return ResponseEntity
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.CONFLICT);

	}
	
	

}
