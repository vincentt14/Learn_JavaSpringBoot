package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

  public TrackCoach() {
    System.out.println("in constructor " + getClass().getSimpleName());
  }

  @Override
  public String dailyWorkout() {
    return "Trackkkkk coach";
  }

  @Override
  public Integer baba() {
    return 890890;
  }
}
