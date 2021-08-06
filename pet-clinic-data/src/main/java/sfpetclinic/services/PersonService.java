package sfpetclinic.services;

public interface PersonService<T, S> {

  T findByFirstName(S firstName);

  T findByLastName(S lastName);

}
