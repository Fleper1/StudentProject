package reseacrh.project.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reseacrh.project.students.enteties.Contacts;

@Repository
public interface ContactsRepo extends JpaRepository<Contacts, Integer> {
}
