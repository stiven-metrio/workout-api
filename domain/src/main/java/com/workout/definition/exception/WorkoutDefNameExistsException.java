package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

/**
 * Exception thrown when a workout definition name already exists.
 * <p>
 * This exception is used to indicate that a provided workout definition name already exists in the system.
 */
public class WorkoutDefNameExistsException extends TrackerException {

	/**
	 * Constructs a new WorkoutDefNameExistsException with the specified name.
	 *
	 * @param name The name that already exists.
	 */
	public WorkoutDefNameExistsException(String name) {
		super(WorkoutDefNameExistsException.class.getName(), String.format("The workout definition name <%s> already exists", name), "WDE004", null);
	}
}
