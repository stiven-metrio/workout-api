package com.workout;

import com.cloudogu.cb.CommandBus;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for handling workout definition-related HTTP requests.
 * <p>
 * This class defines REST endpoints for creating workout definitions.
 */
@RestController
public class WorkoutDefController {

	private final CommandBus commandBus;

	/**
	 * Constructs a new WorkoutDefController with the specified CommandBus.
	 *
	 * @param commandBus The CommandBus used for executing commands.
	 */
	public WorkoutDefController(CommandBus commandBus) {
		this.commandBus = commandBus;
	}

	/**
	 * Endpoint for creating a new workout definition.
	 *
	 * @param workoutDefCreateRequest The request body containing information for creating the workout definition.
	 * @return The response containing the ID of the created workout definition.
	 */
	@PostMapping(value = "/workout-def", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public WorkoutDefCreateResponse createWorkoutDef(@RequestBody WorkoutDefCreateRequest workoutDefCreateRequest) {
		var workoutDefId = commandBus.execute(workoutDefCreateRequest.toCommand());
		return new WorkoutDefCreateResponse(workoutDefId.getValue());
	}
}
