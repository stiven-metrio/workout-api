package com.workout.config;

import com.workout.IWorkoutDefCreate;
import com.workout.WorkoutDefCreate;
import com.workout.WorkoutDefCreateCommandHandler;
import com.workout.definition.IWorkoutDefRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for setting up beans related to workout definitions.
 * <p>
 * This class is annotated with @Configuration, indicating that it provides bean definitions for the application context.
 */
@Configuration
public class WorkoutDefConfig {

	/**
	 * Configures and provides a bean for creating workout definition use case.
	 *
	 * @param workoutDefRepository The repository for accessing and persisting workout definitions.
	 * @return The configured bean for creating workout definitions.
	 */
	@Bean
	public IWorkoutDefCreate workoutDefCreate(IWorkoutDefRepository workoutDefRepository) {
		return new WorkoutDefCreate(workoutDefRepository);
	}

	/**
	 * Configures and provides a command handler for creating workout definitions.
	 *
	 * @param workoutDefCreate The service for creating workout definitions.
	 * @return The configured command handler for creating workout definitions.
	 */
	@Bean
	public WorkoutDefCreateCommandHandler workoutDefCreateCommandHandler(IWorkoutDefCreate workoutDefCreate) {
		return new WorkoutDefCreateCommandHandler(workoutDefCreate);
	}
}
