package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Integer> {

  Vet findByLastName(String lastName);
}