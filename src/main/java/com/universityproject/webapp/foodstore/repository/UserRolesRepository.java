package com.universityproject.webapp.foodstore.repository;

import com.universityproject.webapp.foodstore.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Integer> {
    // Add custom query methods if needed
}