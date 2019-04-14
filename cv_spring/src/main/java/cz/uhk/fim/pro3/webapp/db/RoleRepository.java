package cz.uhk.fim.pro3.webapp.db;

import cz.uhk.fim.pro3.webapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
