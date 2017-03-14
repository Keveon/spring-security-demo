package com.keveon.repository;

import com.keveon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Keveon on 2017/3/10.
 * User repository
 */
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
    User findByUsername(String username);
}
