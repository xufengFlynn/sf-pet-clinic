package flynn.springframework.sfpetclinic.services;

import flynn.springframework.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
