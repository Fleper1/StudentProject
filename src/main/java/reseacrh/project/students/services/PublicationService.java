package reseacrh.project.students.services;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reseacrh.project.students.controllers.PublicationsController;
import reseacrh.project.students.enteties.Publication;
import reseacrh.project.students.repositories.PublicationsRepo;

import java.util.List;
import java.util.Optional;

@Service
public class PublicationService {

    private final PublicationsRepo publicationsRepo;

    @Autowired
    public PublicationService(PublicationsRepo publicationsRepo){
        this.publicationsRepo = publicationsRepo;
    }

    public Publication newPublication(Publication publication){
        return publicationsRepo.save(publication);
    }

    public List<Publication> getAllPublications(){
        return publicationsRepo.findAll();
    }

    public Publication getPublicationById(ObjectId id) {
        return publicationsRepo.findPublicationById(id);
    }
}
