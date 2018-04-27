package com.luv2code.springdemo;

public class MyHappyFortuneService implements DailyFortuneService{

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day";
	}

}
