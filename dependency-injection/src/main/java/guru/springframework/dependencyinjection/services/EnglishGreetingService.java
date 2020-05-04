package guru.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingService implements GreetingService {
  @Override
  public String getGreeting() {
    return "Hello, world!";
  }
}
