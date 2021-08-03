package sfpetclinic.services;

import java.util.List;
import sfpetclinic.model.Pet;

public interface PetService {

  Pet findById(Long id);

  void save(Pet pet);

  List<Pet> findAll();

}
