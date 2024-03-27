package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

public class WorkoutDefCategoryNullOrEmptyException extends TrackerException {

	public WorkoutDefCategoryNullOrEmptyException() {
		super(WorkoutDefCategoryNullOrEmptyException.class.getName(), "The workout definition category should not be null or empty","WDE002", null);
	}
}
