package reseacrh.project.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import reseacrh.project.students.enteties.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findUserById(Long id);
}
