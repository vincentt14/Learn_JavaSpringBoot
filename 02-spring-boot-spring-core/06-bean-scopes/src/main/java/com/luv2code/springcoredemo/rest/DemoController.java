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
  private Coach anotherCoach;

  // define a constructor for constructor injection
  @Autowired
  public DemoController(
      @Qualifier("baseballCoach") Coach theCoach,
      @Qualifier("baseballCoach") Coach theAnotherCoach) {
    System.out.println("in constructor " + getClass().getSimpleName());
    myCoach = theCoach;
    anotherCoach = theAnotherCoach;
  }

  @GetMapping("/check")
  public String check() {
    return "Comparing beans: myCoach  == anotherCoach, " + (myCoach == anotherCoach);
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
