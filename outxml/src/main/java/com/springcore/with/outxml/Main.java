package com.springcore.with.outxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
Student st1=(Student) con.getBean("getstudent");
System.out.println(st1);
st1.study();
	}

}
