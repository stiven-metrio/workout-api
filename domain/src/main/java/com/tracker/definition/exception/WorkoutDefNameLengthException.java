package com.tracker.definition.exception;

import com.tracker.common.exception.TrackerException;

/**
 * Exception thrown when a workout definition name exceeds the maximum length limit.
 * <p>
 * This exception is used to indicate that a provided workout definition name exceeds the maximum allowed length limit.
 */
public class WorkoutDefNameLengthException extends TrackerException {

	/**
	 * Constructs a new WorkoutDefNameLengthException with the specified name and limit.
	 *
	 * @param name  The name that exceeds the length limit.
	 * @param limit The maximum length limit.
	 */
	public WorkoutDefNameLengthException(String name, int limit) {
		super(WorkoutDefNameLengthException.class.getName(), String.format("The workout definition name <%s> exceeds the limit <%d> length", name, limit),
			"WDE005", null);
	}
}
