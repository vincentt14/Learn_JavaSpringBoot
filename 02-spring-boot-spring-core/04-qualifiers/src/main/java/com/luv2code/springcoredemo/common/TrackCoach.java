package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
  @Override
  public String dailyWorkout() {
    return "Trackkkkk coach";
  }

  @Override
  public Integer baba() {
    return 890890;
  }
}
