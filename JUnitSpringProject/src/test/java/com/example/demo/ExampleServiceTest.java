package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ExampleServiceTest {

	@Autowired
	ExampleServiceImpl exampleService;

	 @DisplayName("Test Spring @Autowired Integration")
	 @Test
	 void testGet()
	 {
		 
		 assertEquals("Hello JUnit 5", exampleService.get());
	 }


	
	
}
