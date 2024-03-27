package com.tracker.adapter;

import com.tracker.entity.WorkoutDefEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * JPA repository interface for accessing workout definitions stored in a database.
 * <p>
 * This interface extends JpaRepository to inherit CRUD (Create, Read, Update, Delete) operations for workout definition entities.
 */
@Repository
public interface JpaWorkoutDefRepository extends JpaRepository<WorkoutDefEntity, String> {

	/**
	 * Retrieves a workout definition entity by its name.
	 *
	 * @param name The name of the workout definition entity.
	 * @return An Optional containing the workout definition entity if found, or empty if not found.
	 */
	Optional<WorkoutDefEntity> findByName(String name);
}
