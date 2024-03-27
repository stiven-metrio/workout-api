package com.workout.config;

import com.workout.IWorkoutDefCreate;
import com.workout.WorkoutDefCreate;
import com.workout.WorkoutDefCreateCommandHandler;
import com.workout.definition.IWorkoutDefRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkoutDefConfig {

	@Bean
	public IWorkoutDefCreate workoutDefCreate(IWorkoutDefRepository workoutDefRepository) {
		return new WorkoutDefCreate(workoutDefRepository);
	}

	@Bean
	public WorkoutDefCreateCommandHandler workoutDefCreateCommandHandler(IWorkoutDefCreate workoutDefCreate) {
		return new WorkoutDefCreateCommandHandler(workoutDefCreate);
	}
}
