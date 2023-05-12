package reseacrh.project.students.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reseacrh.project.students.enteties.Backlinking;
import reseacrh.project.students.repositories.BacklinkingRepo;

import java.util.List;

@Service
public class BacklinkingService {

    BacklinkingRepo backlinkingRepo;

    @Autowired
    public BacklinkingService(BacklinkingRepo backlinkingRepo){
        this.backlinkingRepo = backlinkingRepo;
    }

    public Backlinking saveApplyForPublication(Backlinking backlinking){
        return backlinkingRepo.save(backlinking);
    }

    public List<Long> getRespondentsId(Long id) {
        return backlinkingRepo.findCandidates(id);
    }
}
