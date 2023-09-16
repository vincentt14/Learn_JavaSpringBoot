package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
  @Override
  public String dailyWorkout() {
    return "Practice fast bowling for 30 minutes :) !!";
  }

  @Override
  public Integer baba() {
    return 890;
  }
}
