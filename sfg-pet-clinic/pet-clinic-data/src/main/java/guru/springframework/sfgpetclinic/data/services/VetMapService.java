package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.Vet;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Integer> implements VetService {

  @Override
  public Vet findByLastName(String lastName) {
    return null;
  }
}
