package com.workout;

import com.workout.definition.application.WorkoutDefCreateCommand;
import com.workout.definition.domain.WorkoutDefId;

public interface IWorkoutDefCreate {
	WorkoutDefId execute(WorkoutDefCreateCommand workoutDefCreateCommand);
}
