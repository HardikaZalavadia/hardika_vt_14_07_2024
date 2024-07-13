package dev.hardika.RolePermissionAuth.repository;

import dev.hardika.RolePermissionAuth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
