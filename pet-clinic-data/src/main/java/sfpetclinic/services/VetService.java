package sfpetclinic.services;

import java.util.List;
import sfpetclinic.model.Vet;

public interface VetService {

  Vet findById(Long id);

  Vet findByFirstName(String firstName);

  Vet findByLastName(String lastName);

  void save(Vet pet);

  List<Vet> findAll();

}
