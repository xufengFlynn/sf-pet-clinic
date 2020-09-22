package flynn.springframework.sfpetclinic.repositories;

import flynn.springframework.sfpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
