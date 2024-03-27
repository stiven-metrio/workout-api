package com.workout.adapter;

import com.workout.entity.WorkoutDefEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaWorkoutDefRepository extends JpaRepository<WorkoutDefEntity, String> {
	Optional<WorkoutDefEntity> findByName(String name);
}
