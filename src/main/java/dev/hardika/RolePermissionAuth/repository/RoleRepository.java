package dev.hardika.RolePermissionAuth.repository;

import dev.hardika.RolePermissionAuth.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}
