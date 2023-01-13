package com.springcore.with.outxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.with.outxml")
public class JavaConfig {
	@Bean
	public Samosa getsamos() {
		return  new Samosa();
	}
	
@Bean
	public Student getstudent() 
	{
	// creating a new student  object
		Student st= new Student(getsamos());
		
		return st ; 
	}
}
