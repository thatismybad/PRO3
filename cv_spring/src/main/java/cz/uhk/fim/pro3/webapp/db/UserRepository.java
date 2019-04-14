package cz.uhk.fim.pro3.webapp.db;

import cz.uhk.fim.pro3.webapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
