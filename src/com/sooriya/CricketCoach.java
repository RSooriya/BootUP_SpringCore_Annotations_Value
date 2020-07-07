package com.sooriya;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Value -> used to inject values read from properties file
@Component
public class CricketCoach implements Coach {
    @Value("${name}")
	private String name;
    @Value("${email}")
	private String email;
	@Override
	public String getDailyWorkout() {
		return "Practice batting for daily 30 mins";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
