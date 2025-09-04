package e_commerce.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import e_commerce.user_service.entity.Role;
import e_commerce.user_service.enums.UserRole;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {

    Optional<Role> findByName(UserRole name);

    boolean existsByName(UserRole name);
}
