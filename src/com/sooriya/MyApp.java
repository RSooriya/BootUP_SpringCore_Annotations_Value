package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
      ClassPathXmlApplicationContext context = new 
    		  ClassPathXmlApplicationContext("applicationContext.xml");
      CricketCoach cricketCoach = context.getBean("cricketCoach",CricketCoach.class);
      System.out.println(cricketCoach.getDailyWorkout());
      System.out.println(cricketCoach.getName());
      System.out.println(cricketCoach.getEmail());
      context.close();
	}

}
