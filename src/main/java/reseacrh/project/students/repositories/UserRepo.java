package reseacrh.project.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reseacrh.project.students.enteties.User;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findUserById(Integer id);
    Optional<User> findByEmail(String Email);
}
