package com.workout.definition.domain;

import com.workout.common.domain.StringValueObject;
import com.workout.definition.exception.WorkoutDefCategoryLengthException;
import com.workout.definition.exception.WorkoutDefCategoryNullOrEmptyException;

public class WorkoutDefCategory extends StringValueObject {

	private static final int MAX_LENGTH = 60;

	public WorkoutDefCategory(String value) {
		super(value);
		if (value == null || value.trim().isEmpty()) {
			throw new WorkoutDefCategoryNullOrEmptyException();
		}
		if (value.length() > MAX_LENGTH) {
			throw new WorkoutDefCategoryLengthException(value, MAX_LENGTH);
		}
	}
}
