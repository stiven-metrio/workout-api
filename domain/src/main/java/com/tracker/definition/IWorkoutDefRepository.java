package com.tracker.definition;

import com.tracker.definition.domain.WorkoutDef;
import com.tracker.definition.domain.WorkoutDefId;
import com.tracker.definition.domain.WorkoutDefName;

import java.util.Optional;

/**
 * Interface for the repository handling workout definitions.
 * <p>
 * This interface defines methods for retrieving and storing workout definitions.
 */
public interface IWorkoutDefRepository {

	/**
	 * Retrieves a workout definition by its ID.
	 *
	 * @param id The ID of the workout definition.
	 * @return An Optional containing the workout definition if found, or empty if not found.
	 */
	Optional<WorkoutDef> findById(WorkoutDefId id);

	/**
	 * Retrieves a workout definition by its name.
	 *
	 * @param name The name of the workout definition.
	 * @return An Optional containing the workout definition if found, or empty if not found.
	 */
	Optional<WorkoutDef> findByName(WorkoutDefName name);

	/**
	 * Creates a new workout definition.
	 *
	 * @param workoutDef The workout definition to be created.
	 */
	void create(WorkoutDef workoutDef);
}
