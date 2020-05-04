package guru.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SpanishGreetingService implements GreetingService {
  @Override
  public String getGreeting() {
    return "Hola, mundo!";
  }
}
