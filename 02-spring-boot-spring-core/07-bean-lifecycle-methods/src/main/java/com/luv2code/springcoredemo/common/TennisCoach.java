package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  public TennisCoach() {
    System.out.println("in constructor " + getClass().getSimpleName());
  }

  @Override
  public String dailyWorkout() {
    return "Tennisssssssss Coach";
  }

  @Override
  public Integer baba() {
    return 23232;
  }
}
