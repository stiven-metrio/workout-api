package com.tracker.common.exception;

import com.tracker.common.domain.TrackerError;
import lombok.Getter;

import java.io.Serial;

/**
 * Base class for exceptions in the tracker system.
 * <p>
 * This class extends RuntimeException and encapsulates information about the error in a TrackerError object.
 */
@Getter
public class TrackerException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 8081860463641545209L;

	private final TrackerError error;

	/**
	 * Constructs a new TrackerException with the provided title, description, code, and data.
	 *
	 * @param title       The title of the error.
	 * @param description The description of the error.
	 * @param code        The error code.
	 * @param data        Additional data related to the error.
	 */
	public TrackerException(String title, String description, String code, String data) {
		this.error = new TrackerError(title, description, code, data);
	}
}
