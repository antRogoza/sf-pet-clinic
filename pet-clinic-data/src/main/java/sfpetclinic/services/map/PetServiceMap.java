package sfpetclinic.services.map;

import java.util.Set;
import sfpetclinic.model.Pet;
import sfpetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Long, Pet> implements CrudService<Pet, Long> {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Pet save( Pet element) {
    return super.save(element.getId(), element);
  }

  @Override
  public void delete(Pet element) {
    super.delete(element);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
