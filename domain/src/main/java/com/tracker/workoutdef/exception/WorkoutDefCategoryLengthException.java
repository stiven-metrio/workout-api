package com.tracker.workoutdef.exception;

import com.tracker.common.exception.TrackerException;

/**
 * Exception thrown when a workout definition category exceeds the maximum length limit.
 * <p>
 * This exception is used to indicate that a provided workout definition category exceeds the maximum allowed length limit.
 */
public class WorkoutDefCategoryLengthException extends TrackerException {

	/**
	 * Constructs a new WorkoutDefCategoryLengthException with the specified category and limit.
	 *
	 * @param category The category that exceeds the length limit.
	 * @param limit    The maximum length limit.
	 */
	public WorkoutDefCategoryLengthException(String category, int limit) {
		super(WorkoutDefCategoryLengthException.class.getName(),
			String.format("The workout definition category <%s> exceeds the limit <%d> length", category, limit), "WDE001", null);
	}
}
