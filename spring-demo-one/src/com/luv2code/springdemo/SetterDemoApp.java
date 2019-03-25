package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	//load the spring configuration app
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	//Retrieve the bean from the container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
	//call methods to the container
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
	//Call the methods to get literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
	//close the context
		
		context.close();
	

	}

}
