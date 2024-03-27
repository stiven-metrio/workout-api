package com.workout.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for setting up the object mapper.
 * <p>
 * This class is annotated with @Configuration, indicating that it provides bean definitions for the application context.
 */
@Configuration
public class MapperConfig {

	/**
	 * Configures and provides a ModelMapper bean.
	 *
	 * @return The configured ModelMapper instance.
	 */
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
}
