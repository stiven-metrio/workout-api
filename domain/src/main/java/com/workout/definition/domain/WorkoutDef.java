package com.workout.definition.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class WorkoutDef {
	private final WorkoutDefId id;
	private WorkoutDefName name;
	private WorkoutDefType type;
	private WorkoutDefCategory category;
	private WorkoutDefNote note;
}
