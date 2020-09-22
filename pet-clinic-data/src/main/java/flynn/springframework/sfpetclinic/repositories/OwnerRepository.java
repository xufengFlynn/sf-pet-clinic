package flynn.springframework.sfpetclinic.repositories;

import flynn.springframework.sfpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
