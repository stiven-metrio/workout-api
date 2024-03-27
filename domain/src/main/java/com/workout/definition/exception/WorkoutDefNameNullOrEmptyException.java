package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

/**
 * Exception thrown when a workout definition name is null or empty.
 * <p>
 * This exception is used to indicate that a provided workout definition name is null or empty, which is not allowed.
 */
public class WorkoutDefNameNullOrEmptyException extends TrackerException {

	/**
	 * Constructs a new WorkoutDefNameNullOrEmptyException.
	 */
	public WorkoutDefNameNullOrEmptyException() {
		super(WorkoutDefNameNullOrEmptyException.class.getName(), "The workout definition name should not be null or empty", "WDE006", null);
	}
}
