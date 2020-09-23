package flynn.springframework.sfpetclinic.services.map;

import flynn.springframework.sfpetclinic.model.Visit;
import flynn.springframework.sfpetclinic.services.VisitService;

import java.util.Set;

public class VisitMapService extends AbstactMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
            || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public void deleteById(Long visit) {
        super.deleteById(visit);
    }
}
