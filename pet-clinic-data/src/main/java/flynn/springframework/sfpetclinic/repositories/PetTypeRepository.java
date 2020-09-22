package flynn.springframework.sfpetclinic.repositories;

import flynn.springframework.sfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
