package sfpetclinic.services.map;

import java.util.Set;
import sfpetclinic.model.Owner;
import sfpetclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Long, Owner> implements
    CrudService<Owner, Long> {

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Owner save( Owner element) {
    return super.save(element.getId(), element);
  }

  @Override
  public void delete(Owner element) {
    super.delete(element);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
