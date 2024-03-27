package com.tracker.definition.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Represents a workout definition domain object in the system.
 * <p>
 * This class encapsulates information about a workout definition.
 * Instances of this class are immutable once constructed.
 */
@Getter
@AllArgsConstructor
public final class WorkoutDef {
	private final WorkoutDefId id;
	private WorkoutDefName name;
	private WorkoutDefType type;
	private WorkoutDefCategory category;
	private WorkoutDefNote note;
}
