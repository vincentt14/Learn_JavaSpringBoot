package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;

@RestController
public class DemoController {

  // define a private field for the dependency
  private Coach myCoach;

  // define a constructor for constructor injection
  @Autowired
  public DemoController(
      @Qualifier("cricketCoach") Coach theCoach) {
    System.out.println("in constructor " + getClass().getSimpleName());
    myCoach = theCoach;
  }

  @GetMapping("/dailyWorkout")
  public String getDailyWorkout() {
    return myCoach.dailyWorkout();
  }

  @GetMapping("/baba")
  public Integer getBaba() {
    return myCoach.baba();
  }
}
