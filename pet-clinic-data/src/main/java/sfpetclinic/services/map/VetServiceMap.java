package sfpetclinic.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import sfpetclinic.model.Vet;
import sfpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Long, Vet> implements VetService {

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Vet save( Vet element) {
    return super.save(element.getId(), element);
  }

  @Override
  public void delete(Vet element) {
    super.delete(element);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public Vet findByFirstName(String firstName) {
    return null;
  }

  @Override
  public Vet findByLastName(String lastName) {
    return null;
  }
}