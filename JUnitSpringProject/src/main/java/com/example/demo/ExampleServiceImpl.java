package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class ExampleServiceImpl {
	
	 @Autowired  
	 ExampleRepositoryImpl exampleRepository;    
	 public String get() {     
		 return exampleRepository.get();
		 }

}
