package reseacrh.project.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reseacrh.project.students.enteties.Roles;

@Repository
public interface RolesRepo extends JpaRepository<Roles, Integer> {
}
