package guru.springframework.dependencyinjection.controllers;

import guru.springframework.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new ConstructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  void test_getGreeting() {
    assertEquals("Hello, World!", controller.getGreeting());
  }
}