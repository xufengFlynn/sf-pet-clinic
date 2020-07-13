package flynn.springframework.sfpetclinic.services.map;

import flynn.springframework.sfpetclinic.model.Owner;
import flynn.springframework.sfpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstactMapService<Owner, Long> implements OwnerService {
    //Use super. This is because OwnerMapService extends AbstractMapService that already has the implementation of finadAll(), So we don't need to again provide an implementation of findAll() in OwnerMapService, but instead, call the findAll() of its superclass (AbstractMapService)
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
