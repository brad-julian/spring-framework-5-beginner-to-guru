package guru.springframework.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"EN", "default"})
public class EnglishGreetingService implements GreetingService {
  @Override
  public String getGreeting() {
    return "Hello, world!";
  }
}
