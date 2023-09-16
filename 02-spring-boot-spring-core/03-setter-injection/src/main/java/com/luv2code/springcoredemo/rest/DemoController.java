package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;

@RestController
public class DemoController {

  // define a private field for the dependency
  private Coach myCoach;

  // define a setter for setter injection
  @Autowired
  public void setCoach(Coach theCoach) {
    myCoach = theCoach;
  }

  @GetMapping("/dailyWorkout")
  public String getDailyWorkout() {
    return myCoach.dailyWorkout();
  }
}
