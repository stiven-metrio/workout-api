package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

public class WorkoutDefIdExistsException extends TrackerException {

	public WorkoutDefIdExistsException(String id) {
		super(WorkoutDefIdExistsException.class.getName(), String.format("The workout definition id <%s> already exists", id), "WDE003", null);
	}
}
