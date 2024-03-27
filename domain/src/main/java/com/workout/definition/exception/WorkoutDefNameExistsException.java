package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

public class WorkoutDefNameExistsException extends TrackerException {

	public WorkoutDefNameExistsException(String name) {
		super(WorkoutDefNameExistsException.class.getName(), String.format("The workout definition name <%s> already exists", name), "WDE004", null);
	}
}
