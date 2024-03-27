package com.workout;

import com.workout.definition.application.WorkoutDefCreateCommand;
import com.workout.definition.domain.WorkoutDefId;

/**
 * Interface for creating a new workout definition.
 */
public interface IWorkoutDefCreate {

	/**
	 * Executes the command to create a new workout definition.
	 *
	 * @param workoutDefCreateCommand The command containing information for creating the workout definition.
	 * @return The ID of the newly created workout definition.
	 */
	WorkoutDefId execute(WorkoutDefCreateCommand workoutDefCreateCommand);
}
