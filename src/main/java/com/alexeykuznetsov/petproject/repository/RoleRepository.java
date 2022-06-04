package com.alexeykuznetsov.petproject.repository;

import com.alexeykuznetsov.petproject.entity.Role;
import com.alexeykuznetsov.petproject.entity.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(UserRoleEnum roleEnum);
}
