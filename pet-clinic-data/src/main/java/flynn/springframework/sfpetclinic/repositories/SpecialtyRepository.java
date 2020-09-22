package flynn.springframework.sfpetclinic.repositories;

import flynn.springframework.sfpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
