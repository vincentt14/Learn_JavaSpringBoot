package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  // define a private field for the dependency
  private Coach myCoach;

  // degine a constructor for dependency injection
  @Autowired
  public DemoController(Coach myCoach) {
    myCoach = theCoach;
  }

  @GetMapping("/dailyWorkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }
}
