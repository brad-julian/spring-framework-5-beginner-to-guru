package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.Owner;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Integer> implements OwnerService {

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }
}
