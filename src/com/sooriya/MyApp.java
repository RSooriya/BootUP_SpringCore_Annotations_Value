package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
	  //creating spring container and loading configuration file 
      ClassPathXmlApplicationContext context = new 
    		  ClassPathXmlApplicationContext("applicationContext.xml");
      //retrieving beans from container
      CricketCoach cricketCoach = context.getBean("cricketCoach",CricketCoach.class);
      //calling methods on bean
      System.out.println(cricketCoach.getDailyWorkout());
      System.out.println(cricketCoach.getName());
      System.out.println(cricketCoach.getEmail());
      context.close();
	}

}
