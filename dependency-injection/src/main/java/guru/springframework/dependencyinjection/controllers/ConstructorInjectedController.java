package guru.springframework.dependencyinjection.controllers;

import guru.springframework.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

  private final GreetingService greetingService;

  public ConstructorInjectedController(@Qualifier("spanishGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.getGreeting();
  }
}
