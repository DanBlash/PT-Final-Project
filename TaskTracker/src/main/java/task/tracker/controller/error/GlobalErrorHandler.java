package task.tracker.controller.error;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j

public class GlobalErrorHandler {
	
	@ExceptionHandler(NoSuchElementException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> ErrorHandler (NoSuchElementException ex) {
		log.error("Error: {}", ex.toString());
		
		Map <String, String> errorMessage = new HashMap<>();
		errorMessage.put("Message", ex.toString());
		return errorMessage;
	}
	
	
}