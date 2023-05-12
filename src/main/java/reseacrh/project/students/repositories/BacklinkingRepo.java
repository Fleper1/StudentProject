package reseacrh.project.students.repositories;

import com.sun.source.doctree.IndexTree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import reseacrh.project.students.enteties.Backlinking;

import java.util.List;

@Repository
public interface BacklinkingRepo extends JpaRepository<Backlinking, Integer> {

    @Query(value = "SELECT `candidate` From `backlinking` where `owner_id`=?1", nativeQuery = true)
    List<Long> findCandidates(Long ownerId);
}
