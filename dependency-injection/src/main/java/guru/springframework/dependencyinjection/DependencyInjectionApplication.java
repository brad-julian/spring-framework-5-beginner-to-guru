package guru.springframework.dependencyinjection;

import guru.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import guru.springframework.dependencyinjection.controllers.I18nGreetingController;
import guru.springframework.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

    MyController myController = (MyController) ctx.getBean("myController");

    System.out.println(myController.greeting());

    System.out.println("------- ConstructorInjectedController");
    ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
    System.out.println(constructorInjectedController.getGreeting());

    System.out.println("------- I18nGreetingController");
    I18nGreetingController i18nGreetingController = (I18nGreetingController) ctx.getBean("i18nGreetingController");
    System.out.println(i18nGreetingController.getGreeting());
  }

}
