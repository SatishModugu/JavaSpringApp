package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//Define Private filed for the dependency
	private FortuneService fortuneServie;
	
	//Define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneServie= theFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneservice to get a fortune
		return fortuneServie.getFortune();
	}

}
