package com.keveon.service;

import com.keveon.model.Roles;

import java.util.Set;

/**
 * Created by Keveon on 2017/3/10.
 * Role service
 */
public interface RoleService {
    Boolean authorized(String username, String serializable, String permission);

    Set<Roles> getRoles(String username);
}
