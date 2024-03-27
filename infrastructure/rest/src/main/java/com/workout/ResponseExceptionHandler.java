package com.workout;

import com.workout.common.domain.TrackerError;
import com.workout.common.exception.IdentifierInvalidException;
import com.workout.common.exception.TrackerException;
import com.workout.definition.exception.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ResponseExceptionHandler {

	@ExceptionHandler({IdentifierInvalidException.class, WorkoutDefCategoryLengthException.class, WorkoutDefNameLengthException.class,
		WorkoutDefCategoryNullOrEmptyException.class, WorkoutDefNameNullOrEmptyException.class, WorkoutDefTypeNullOrEmptyException.class,
		WorkoutDefTypeInvalidException.class})
	protected ResponseEntity<TrackerError> badRequest(TrackerException ex) {
		return new ResponseEntity<>(ex.getError(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({WorkoutDefIdExistsException.class, WorkoutDefNameExistsException.class})
	protected ResponseEntity<TrackerError> conflict(TrackerException ex) {
		return new ResponseEntity<>(ex.getError(), HttpStatus.CONFLICT);
	}
}
