package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.Vet;

public class VetMapService extends AbstractMapService<Vet, Integer> implements CrudService<Vet, Integer> {

  @Override
  public Vet save(Vet object) {
    return super.save(object.getId(), object);
  }
}
