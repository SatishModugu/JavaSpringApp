package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it:"+fortuneService.getFortune();
	}
	//Add an init method 
	public void doMyStartupStuff(){
		System.out.println("Trach coach: Inside doMyStartupStuff");
		
	}
	
	
	//Add the destroy method
	public void doMyCleanupStuff(){
		System.out.println("Trach coach: Inside doMyCleanupStuff");
		
	}

}
