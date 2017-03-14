package com.keveon.repository;

import com.keveon.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Set;

/**
 * Created by Keveon on 2017/3/10.
 * Roles repository
 */
public interface RolesRepository extends JpaRepository<Roles, Integer>, JpaSpecificationExecutor<Roles> {
    Set<Roles> findByUserUsername(String username);
}
