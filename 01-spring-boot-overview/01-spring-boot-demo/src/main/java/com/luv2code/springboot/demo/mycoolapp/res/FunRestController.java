package com.luv2code.springboot.demo.mycoolapp.res;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
  // expose "/" that run "Hello World"
  @GetMapping("/")
  public String sayHello() {
    return "hello world dsadsa!";
  }
}
