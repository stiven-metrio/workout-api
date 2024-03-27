package com.tracker;

import com.tracker.common.domain.TrackerError;
import com.tracker.common.exception.IdentifierInvalidException;
import com.tracker.common.exception.TrackerException;
import com.tracker.definition.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Global exception handler for mapping application-specific exceptions to HTTP response status codes.
 * <p>
 * This class provides centralized exception handling for specific exceptions and maps them to appropriate HTTP status codes.
 */
@ControllerAdvice
public class ResponseExceptionHandler {

	/**
	 * Handles exceptions related to bad requests (e.g., invalid identifiers, length constraints).
	 *
	 * @param ex The exception to handle.
	 * @return ResponseEntity with error information and HTTP status code set to BAD_REQUEST.
	 */
	@ExceptionHandler({IdentifierInvalidException.class, WorkoutDefCategoryLengthException.class, WorkoutDefNameLengthException.class,
		WorkoutDefCategoryNullOrEmptyException.class, WorkoutDefNameNullOrEmptyException.class, WorkoutDefTypeNullOrEmptyException.class,
		WorkoutDefTypeInvalidException.class})
	protected ResponseEntity<TrackerError> badRequest(TrackerException ex) {
		return new ResponseEntity<>(ex.getError(), HttpStatus.BAD_REQUEST);
	}

	/**
	 * Handles exceptions related to conflicts (e.g., duplicate entries).
	 *
	 * @param ex The exception to handle.
	 * @return ResponseEntity with error information and HTTP status code set to CONFLICT.
	 */
	@ExceptionHandler({WorkoutDefIdExistsException.class, WorkoutDefNameExistsException.class})
	protected ResponseEntity<TrackerError> conflict(TrackerException ex) {
		return new ResponseEntity<>(ex.getError(), HttpStatus.CONFLICT);
	}
}
