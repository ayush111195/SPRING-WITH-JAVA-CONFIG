package com.springcore.with.outxml;

import org.springframework.stereotype.Component;


public class Student {
	
private Samosa samosa;	

public Samosa getSamosa() {
	return samosa;
}
public void setSamosa(Samosa samosa) {
	this.samosa = samosa;
}
public Student(Samosa samosa) {
	super();
	this.samosa = samosa;
	
}

public void study() {
	this.samosa.display();
	System.out.println("student is reading the book ");
}
}
