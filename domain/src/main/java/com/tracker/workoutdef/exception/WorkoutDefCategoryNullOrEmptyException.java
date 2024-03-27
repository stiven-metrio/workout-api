package com.tracker.workoutdef.exception;

import com.tracker.common.exception.TrackerException;

/**
 * Exception thrown when a workout definition category is null or empty.
 * <p>
 * This exception is used to indicate that a provided workout definition category is null or empty, which is not allowed.
 */
public class WorkoutDefCategoryNullOrEmptyException extends TrackerException {

	/**
	 * Constructs a new WorkoutDefCategoryNullOrEmptyException.
	 */
	public WorkoutDefCategoryNullOrEmptyException() {
		super(WorkoutDefCategoryNullOrEmptyException.class.getName(), "The workout definition category should not be null or empty", "WDE002", null);
	}
}
