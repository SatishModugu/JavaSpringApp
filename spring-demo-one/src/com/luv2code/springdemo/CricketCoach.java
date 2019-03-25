package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for emailAdress and team;
	private String emailAddress;
	private String team;
	

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAdfress) {
		System.out.println("Inside the setter method - Email Adress");
		this.emailAddress = emailAdfress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Inside the setter method - SetTeam");
		this.team = team;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practive Fast Bowling";
	}
	public CricketCoach()
	{
		System.out.println("Inside of no-args constructor");
	}
	//Creating Setter Method 
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside the setter method");
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
