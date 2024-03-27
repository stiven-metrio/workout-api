package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

public class WorkoutDefTypeInvalidException extends TrackerException {

	public WorkoutDefTypeInvalidException(String type) {
		super(WorkoutDefTypeInvalidException.class.getName(), String.format("The workout definition type <%s> is not valid", type), "WDE007", null);
	}
}
