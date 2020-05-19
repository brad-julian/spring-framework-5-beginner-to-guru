package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Integer> {

  protected Map<Integer, T> map = new HashMap<>();

  public Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  public T findById(ID id) {
    return map.get(id);
  }

  public T save(T object) {
    if (object == null)
      throw new IllegalArgumentException("Object passed to `save()` cannot be null");

    if (object.getId() == null)
      object.setId(getNextId());

    map.put(object.getId(), object);
    return object;
  }

  public void delete(T object) {
    map.entrySet().removeIf(entry -> Objects.equals(entry.getValue(), object));
  }

  public void deleteById(ID id) {
    map.remove(id);
  }

  //////////  private  //////////
  private Integer getNextId() {
    if (map.isEmpty()) {
      return 1;
    }
    return Collections.max(map.keySet()) + 1;
  }
}
