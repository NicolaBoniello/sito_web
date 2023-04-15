package sitowebmine.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import sitowebmine.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
