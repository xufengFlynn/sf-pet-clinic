package flynn.springframework.sfpetclinic.repositories;

import flynn.springframework.sfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
