package com.workout.definition.exception;

import com.workout.common.exception.TrackerException;

public class WorkoutDefCategoryLengthException extends TrackerException {

	public WorkoutDefCategoryLengthException(String category, int limit) {
		super(WorkoutDefCategoryLengthException.class.getName(),
			String.format("The workout definition category <%s> exceeds the limit <%d> length", category, limit), "WDE005", null);
	}
}
