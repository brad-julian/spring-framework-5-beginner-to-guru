package guru.springframework.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EnglishGreetingService implements GreetingService {
  @Override
  public String getGreeting() {
    return "Hello, world!";
  }
}
