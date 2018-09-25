package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PropertyReader {
	
	@Autowired
	private ConfigProperty config;
	
	@EventListener(ApplicationReadyEvent.class)
	public void printProperty() {
		System.out.println("Value of test property :"+config.getTestProperty());
	}

}
