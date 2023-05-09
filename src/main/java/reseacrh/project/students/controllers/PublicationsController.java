package reseacrh.project.students.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reseacrh.project.students.enteties.Publication;
import reseacrh.project.students.services.PublicationService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/publications")
public class PublicationsController {

    private final PublicationService publicationService;

    @Autowired
    public PublicationsController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }

    @PostMapping("/giver/create")
    public ResponseEntity<Publication> addPublication(@RequestBody Publication publication) {
        return new ResponseEntity<>(publicationService.newPublication(publication), HttpStatus.CREATED);
    }

    @GetMapping("/searcher")
    public ResponseEntity<List<Publication>> getAllPublications() {
        return new ResponseEntity<>(publicationService.getAllPublications(), HttpStatus.OK);
    }

    @GetMapping("/searcher/{id}")
    public ResponseEntity<Publication> getPublication(@PathVariable ObjectId id) {
        return new ResponseEntity<>(publicationService.getPublicationById(id), HttpStatus.OK);
    }

}
