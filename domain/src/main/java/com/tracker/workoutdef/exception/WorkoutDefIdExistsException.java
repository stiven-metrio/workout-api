package com.tracker.workoutdef.exception;

import com.tracker.common.exception.TrackerException;

/**
 * Exception thrown when a workout definition ID already exists.
 * <p>
 * This exception is used to indicate that a provided workout definition ID already exists in the system.
 */
public class WorkoutDefIdExistsException extends TrackerException {

	/**
	 * Constructs a new WorkoutDefIdExistsException with the specified ID.
	 *
	 * @param id The ID that already exists.
	 */
	public WorkoutDefIdExistsException(String id) {
		super(WorkoutDefIdExistsException.class.getName(), String.format("The workout definition id <%s> already exists", id), "WDE003", null);
	}
}
