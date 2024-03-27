package com.tracker.common.domain;

import lombok.AllArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * Represents an error encountered in the tracker system.
 * <p>
 * This class encapsulates information about the error, including error message, description, error code, and additional data.
 */
@AllArgsConstructor
public class TrackerError implements Serializable {

	@Serial
	private static final long serialVersionUID = -8777548088292643421L;

	private final String error;
	private final String description;
	private final String code;
	private final String data;
}
