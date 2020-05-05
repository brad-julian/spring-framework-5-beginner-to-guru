package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Integer> {

  Owner findByLastName(String lastName);
}
