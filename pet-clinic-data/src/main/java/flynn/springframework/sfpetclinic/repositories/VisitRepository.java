package flynn.springframework.sfpetclinic.repositories;

import flynn.springframework.sfpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
