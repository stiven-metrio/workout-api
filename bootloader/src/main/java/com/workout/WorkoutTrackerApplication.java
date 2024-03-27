package com.workout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Primary Spring-boot application class
 */
@SpringBootApplication
public class WorkoutTrackerApplication {

	/**
	 * Main method to start the application.
	 *
	 * @param args Command-line arguments passed to the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(WorkoutTrackerApplication.class, args);
	}
}
