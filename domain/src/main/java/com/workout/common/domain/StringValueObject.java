package com.workout.common.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

/**
 * Value object representing a string value.
 * <p>
 * This class encapsulates a string value and provides methods for accessing and manipulating it.
 */
@Getter
@AllArgsConstructor
public class StringValueObject implements Serializable {

	@Serial
	private static final long serialVersionUID = 4656445846130691079L;

	protected final String value;

	/**
	 * Returns a string representation of the value object.
	 *
	 * @return A string representation of the value object. If the value is null, an empty string is returned.
	 */
	@Override
	public String toString() {
		return null == value ? "" : value;
	}
}
