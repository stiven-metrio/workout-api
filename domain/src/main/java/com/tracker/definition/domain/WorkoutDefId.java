package com.tracker.definition.domain;

import com.tracker.common.domain.IdentifierValueObject;

/**
 * Value object that represents the identifier of a workout definition.
 * <p>
 * This class extends IdentifierValueObject and encapsulates information about the identifier of a workout definition.
 */
public class WorkoutDefId extends IdentifierValueObject {

	/**
	 * Constructs a new WorkoutDefId with the specified value.
	 *
	 * @param value The identifier value.
	 */
	public WorkoutDefId(String value) {
		super(value);
	}
}
