package sfpetclinic.services;

import java.util.List;
import sfpetclinic.model.Owner;

public interface OwnerService {

  Owner findById(Long id);

  Owner findByFirstName(String firstName);

  Owner findByLastName(String lastName);

  void save(Owner pet);

  List<Owner> findAll();

}
