package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private String emailAddress;
	private String team;
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Setting email address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Setting team");
		this.team = team;
	}

	private DailyFortuneService dailyFortune;
	public CricketCoach() {
		System.out.println("Constructing cricket coach");
	}
	
	@Override
	public String getDailyWorkout() {
		return "get workout for cricket";
	}

	@Override
	public String getDailyFortune() {
		return dailyFortune.getDailyFortune();
	}
	
	public void setDailyFortune(DailyFortuneService myFortuneService) {
		System.out.println("Inside setDailyFortune");
		this.dailyFortune =  myFortuneService;
	}

}
