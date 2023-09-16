package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

  public BaseballCoach() {
    System.out.println("in constructor " + getClass().getSimpleName());
  }

  @Override
  public String dailyWorkout() {
    return "Baseball Coachhh";
  }

  @Override
  public Integer baba() {
    return 123;
  }
}
