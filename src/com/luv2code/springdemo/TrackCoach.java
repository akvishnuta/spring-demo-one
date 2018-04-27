package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private DailyFortuneService fortuneService;
	
	public TrackCoach(DailyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
