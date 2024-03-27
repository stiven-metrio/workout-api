package com.tracker.workoutdef.exception;

import com.tracker.common.exception.TrackerException;

/**
 * Exception thrown when a workout definition type is invalid.
 * <p>
 * This exception is used to indicate that a provided workout definition type is not valid.
 */
public class WorkoutDefTypeInvalidException extends TrackerException {

	/**
	 * Constructs a new WorkoutDefTypeInvalidException with the specified type.
	 *
	 * @param type The invalid type.
	 */
	public WorkoutDefTypeInvalidException(String type) {
		super(WorkoutDefTypeInvalidException.class.getName(), String.format("The workout definition type <%s> is not valid", type), "WDE007", null);
	}
}
