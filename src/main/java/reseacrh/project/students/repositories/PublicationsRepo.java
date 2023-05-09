package reseacrh.project.students.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import reseacrh.project.students.enteties.Publication;


@Repository
public interface PublicationsRepo extends MongoRepository<Publication, ObjectId> {
    Publication findPublicationById(ObjectId id);
}
