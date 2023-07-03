package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		//load the Spring Configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Reterive bean from spring container
		
		Coach t1=context.getBean("myCoach1",Coach.class);
		
		Coach t2=context.getBean("myCoach2",Coach.class);
		
		//call the method
		
		System.out.println(t1.getDailyWorkout());
		
		System.out.println(t2.getDailyWorkout());
		
		//close the context
		
		context.close();
		
		

	}

}
