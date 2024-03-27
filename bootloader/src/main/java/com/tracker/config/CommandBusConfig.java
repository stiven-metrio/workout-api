package com.tracker.config;

import com.cloudogu.cb.CommandBus;
import com.cloudogu.cb.decorator.LoggingCommandBus;
import com.cloudogu.cb.spring.Registry;
import com.cloudogu.cb.spring.SpringCommandBus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for setting up the command bus.
 * <p>
 * This class is annotated with @Configuration, indicating that it provides bean definitions for the application context.
 */
@Configuration
public class CommandBusConfig {

	/**
	 * Configures and provides a command bus bean.
	 *
	 * @param applicationContext The application context used for bean resolution.
	 * @return The configured command bus instance.
	 */
	@Bean
	public CommandBus commandBus(ApplicationContext applicationContext) {
		return new LoggingCommandBus(new SpringCommandBus(new Registry(applicationContext)));
	}
}
