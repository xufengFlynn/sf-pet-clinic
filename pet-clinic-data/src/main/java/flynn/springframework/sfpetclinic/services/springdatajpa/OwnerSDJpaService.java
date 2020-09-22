package flynn.springframework.sfpetclinic.services.springdatajpa;

import flynn.springframework.sfpetclinic.model.Owner;
import flynn.springframework.sfpetclinic.repositories.OwnerRepository;
import flynn.springframework.sfpetclinic.services.OwnerService;
import flynn.springframework.sfpetclinic.services.PetService;
import flynn.springframework.sfpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetTypeService petTypeService,
                             PetService petService) {
        this.ownerRepository = ownerRepository;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
