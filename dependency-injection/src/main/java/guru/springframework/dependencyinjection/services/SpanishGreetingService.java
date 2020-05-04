package guru.springframework.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nGreetingService")
@Profile("ES")
public class SpanishGreetingService implements GreetingService {
  @Override
  public String getGreeting() {
    return "Hola, mundo!";
  }
}
