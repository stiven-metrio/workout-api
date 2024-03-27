package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

public class WorkoutDefNameNullOrEmptyException extends TrackerException {

	public WorkoutDefNameNullOrEmptyException() {
		super(WorkoutDefNameNullOrEmptyException.class.getName(), "The workout definition name should not be null or empty","WDE006", null);
	}
}
