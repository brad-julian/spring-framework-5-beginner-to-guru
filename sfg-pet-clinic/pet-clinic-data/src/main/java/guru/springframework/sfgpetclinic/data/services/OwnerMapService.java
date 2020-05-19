package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.Owner;

public class OwnerMapService extends AbstractMapService<Owner, Integer> implements OwnerService {

  @Override
  public Owner save(Owner object) {
    return super.save(object.getId(), object);
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }
}
