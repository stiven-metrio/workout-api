package com.tracker.definition.domain;

import com.tracker.common.domain.StringValueObject;
import com.tracker.definition.exception.WorkoutDefCategoryLengthException;
import com.tracker.definition.exception.WorkoutDefCategoryNullOrEmptyException;

/**
 * Value object that represents the category of a workout definition.
 * <p>
 * This class extends StringValueObject and encapsulates information about the category of a workout definition,
 */
public class WorkoutDefCategory extends StringValueObject {

	private static final int MAX_LENGTH = 60;

	/**
	 * Constructs a new WorkoutDefCategory with the specified value.
	 *
	 * @param value The category value.
	 * @throws WorkoutDefCategoryNullOrEmptyException If the provided value is null or empty.
	 * @throws WorkoutDefCategoryLengthException      If the length of the provided value exceeds the maximum allowed length.
	 */
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
