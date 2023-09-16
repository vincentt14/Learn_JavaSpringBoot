package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
  @Override
  public String dailyWorkout() {
    return "Tennisssssssss Coach";
  }

  @Override
  public Integer baba() {
    return 23232;
  }
}
