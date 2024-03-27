package com.workout.definition;

import com.workout.definition.domain.WorkoutDef;
import com.workout.definition.domain.WorkoutDefId;
import com.workout.definition.domain.WorkoutDefName;

import java.util.Optional;

public interface IWorkoutDefRepository {

	Optional<WorkoutDef> findById(WorkoutDefId id);

	Optional<WorkoutDef> findByName(WorkoutDefName name);

	void create(WorkoutDef workoutDef);
}
