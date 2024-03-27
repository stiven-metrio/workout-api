package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

public class WorkoutDefNameLengthException extends TrackerException {

	public WorkoutDefNameLengthException(String name, int limit) {
		super(WorkoutDefNameLengthException.class.getName(), String.format("The workout definition name <%s> exceeds the limit <%d> length", name, limit),
			"WDE005", null);
	}
}
