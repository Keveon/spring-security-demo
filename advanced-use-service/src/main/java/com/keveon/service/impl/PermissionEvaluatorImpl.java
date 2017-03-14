package com.keveon.service.impl;

import com.keveon.model.bo.Login;
import com.keveon.service.LoginService;
import com.keveon.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by Keveon on 2017/3/10.
 * Permission evaluator implements
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PermissionEvaluatorImpl implements PermissionEvaluator {
    private final LoginService loginService;
    private final RoleService roleService;

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        String username = authentication.getName();
        Login login = loginService.findByUsername(username).get();
        return roleService.authorized(login.getUsername(), targetDomainObject.toString(), permission.toString());
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        // not supported
        return false;
    }
}
