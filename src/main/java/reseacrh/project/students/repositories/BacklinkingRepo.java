package reseacrh.project.students.repositories;

import com.sun.source.doctree.IndexTree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reseacrh.project.students.enteties.Backlinking;

@Repository
public interface BacklinkingRepo extends JpaRepository<Backlinking, Integer> {
}
