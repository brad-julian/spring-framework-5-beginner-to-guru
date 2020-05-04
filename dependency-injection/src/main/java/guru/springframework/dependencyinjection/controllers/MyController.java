package guru.springframework.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  public String greeting() {
    return "Hello, world!";
  }
}
