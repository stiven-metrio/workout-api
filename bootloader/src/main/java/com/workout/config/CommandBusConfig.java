package com.workout.config;

import com.cloudogu.cb.CommandBus;
import com.cloudogu.cb.decorator.LoggingCommandBus;
import com.cloudogu.cb.spring.Registry;
import com.cloudogu.cb.spring.SpringCommandBus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandBusConfig {

	@Bean
	public CommandBus commandBus(ApplicationContext applicationContext) {
		return new LoggingCommandBus(new SpringCommandBus(new Registry(applicationContext)));
	}
}
