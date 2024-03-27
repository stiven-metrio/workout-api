package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

public class WorkoutDefTypeNullOrEmptyException extends TrackerException {

	public WorkoutDefTypeNullOrEmptyException() {
		super(WorkoutDefTypeNullOrEmptyException.class.getName(), "The workout definition type should not be null or empty","WDE003", null);
	}
}
