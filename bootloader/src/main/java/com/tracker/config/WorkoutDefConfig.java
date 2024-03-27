package com.tracker.config;

import com.tracker.workoutdef.create.IWorkoutDefCreate;
import com.tracker.workoutdef.create.WorkoutDefCreate;
import com.tracker.workoutdef.create.WorkoutDefCreateCommandHandler;
import com.tracker.workoutdef.IWorkoutDefRepository;
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
