package guru.springframework.sfgpetclinic.web.bootstrap;

import guru.springframework.sfgpetclinic.data.model.Owner;
import guru.springframework.sfgpetclinic.data.model.Vet;
import guru.springframework.sfgpetclinic.data.services.OwnerMapService;
import guru.springframework.sfgpetclinic.data.services.OwnerService;
import guru.springframework.sfgpetclinic.data.services.VetMapService;
import guru.springframework.sfgpetclinic.data.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader() {
    this.ownerService = new OwnerMapService();
    this.vetService = new VetMapService();
  }

  @Override
  public void run(String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setId(1);
    owner1.setFirstName("Tony");
    owner1.setLastName("Stark");

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setId(2);
    owner2.setFirstName("Bruce");
    owner2.setLastName("Banner");

    ownerService.save(owner2);

    System.out.println(ownerService.findAll().size() + " owners loaded");

    Vet vet1 = new Vet();
    vet1.setId(1);
    vet1.setFirstName("Stephen");
    vet1.setLastName("Strange");

    vetService.save(vet1);

    System.out.println(vetService.findAll().size() + " vets loaded");
  }
}
