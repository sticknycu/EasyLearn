package ro.nicolaemariusghergu.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.nicolaemariusghergu.auth.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
