package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet, Integer> implements PetService {

  @Override
  public Pet save(Pet object) {
    return super.save(object.getId(), object);
  }
}
