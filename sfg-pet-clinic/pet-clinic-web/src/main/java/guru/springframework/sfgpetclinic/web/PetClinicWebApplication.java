package guru.springframework.sfgpetclinic.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"guru.springframework.sfgpetclinic"})
public class PetClinicWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicWebApplication.class, args);
	}

}
