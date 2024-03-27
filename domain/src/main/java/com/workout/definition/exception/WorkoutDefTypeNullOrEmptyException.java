package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

/**
 * Exception thrown when a workout definition type is null or empty.
 * <p>
 * This exception is used to indicate that a provided workout definition type is null or empty, which is not allowed.
 */
public class WorkoutDefTypeNullOrEmptyException extends TrackerException {

	/**
	 * Constructs a new WorkoutDefTypeNullOrEmptyException.
	 */
	public WorkoutDefTypeNullOrEmptyException() {
		super(WorkoutDefTypeNullOrEmptyException.class.getName(), "The workout definition type should not be null or empty", "WDE008", null);
	}
}
