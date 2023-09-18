package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach {

  public CricketCoach() {
    System.out.println("in constructor " + getClass().getSimpleName());
  }

  // define our init method
  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println("ini do start up lho: " + getClass().getSimpleName());
  }

  // define our destroy method
  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println("ini kleannnn: " + getClass().getSimpleName());
  }

  @Override
  public String dailyWorkout() {
    return "Practice fast bowling for 30 minutes :) !!";
  }

  @Override
  public Integer baba() {
    return 890;
  }
}
