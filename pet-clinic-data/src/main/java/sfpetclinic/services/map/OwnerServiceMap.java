package sfpetclinic.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import sfpetclinic.model.Owner;
import sfpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Long, Owner> implements
    OwnerService {

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

  @Override
  public Owner findByFirstName(String firstName) {
    return null;
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }
}
