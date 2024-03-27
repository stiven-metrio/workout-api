package com.tracker.common.domain;

import com.tracker.common.exception.IdentifierInvalidException;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

/**
 * Abstract base class for value objects representing identifiers.
 * <p>
 * This class provides common functionality for classes representing identifiers, such as validation
 * of UUID format.
 */
@Getter
public abstract class IdentifierValueObject implements Serializable {

	@Serial
	private static final long serialVersionUID = 608305153118801124L;

	protected String value;

	/**
	 * Constructs a new IdentifierValueObject with the specified value.
	 *
	 * @param value The value of the identifier.
	 */
	protected IdentifierValueObject(String value) {
		validateUuid(value);
		this.value = value;
	}

	/**
	 * Validates that the provided string is a valid UUID.
	 *
	 * @param value The value to validate.
	 */
	private void validateUuid(String value) {
		if (value == null) {
			throw new IdentifierInvalidException(null);
		}
		try {
			UUID.fromString(value);
		} catch (IllegalArgumentException ex) {
			throw new IdentifierInvalidException(value);
		}
	}
}
