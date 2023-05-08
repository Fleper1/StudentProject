package reseacrh.project.students.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import reseacrh.project.students.enteties.Resume;

@Repository
public interface ResumeRepo extends MongoRepository<Resume, ObjectId> {
}
