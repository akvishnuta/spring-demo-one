package com.luv2code.springdemo;

public class BaseballCoach  implements Coach{
	
	public String getDailyWorkout() {
		return "Spend 30 mins on  batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
