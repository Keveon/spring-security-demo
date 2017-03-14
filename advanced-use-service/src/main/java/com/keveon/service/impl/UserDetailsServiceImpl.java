package com.keveon.service.impl;

import com.keveon.model.bo.Login;
import com.keveon.service.LoginService;
import com.keveon.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.hasText;

/**
 * Created by Keveon on 2017/3/10.
 * User details service implement
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserDetailsServiceImpl implements UserDetailsService {
    private final LoginService loginService;
    private final RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) {
        if (!hasText(username)) {
            throw new IllegalArgumentException("用户名为空");
        }

        Login login = loginService.findByUsername(username);

        if (isNull(login) || isNull(login.getUser()))
            throw new UsernameNotFoundException("用户不存在");

        Set<GrantedAuthority> authorities = new HashSet<>();
        roleService.getRoles(login.getUsername()).forEach(r -> authorities.add(new SimpleGrantedAuthority(r.getRole())));

        return new org.springframework.security.core.userdetails.User(
                username, login.getPassword(),
                true,//是否可用
                true,//是否过期
                true,//证书不过期为true
                true,//账户未锁定为true
                authorities);
    }
}
