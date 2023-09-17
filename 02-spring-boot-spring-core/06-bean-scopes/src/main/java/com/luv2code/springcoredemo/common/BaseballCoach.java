package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
