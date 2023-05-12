package reseacrh.project.students.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import reseacrh.project.students.enteties.Resume;

import java.util.List;

@Repository
public interface ResumeRepo extends MongoRepository<Resume, ObjectId> {
    Resume findResumeByImdbId(String imdbId);

    @Query("{'ownerId' : {$in : ?0}}")
    List<Resume> findResumes(List<Long> usersId);
}
