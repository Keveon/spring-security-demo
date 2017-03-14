package com.keveon.service;

import com.keveon.model.bo.Login;

/**
 * Created by Keveon on 2017/3/10.
 * Login service
 */
public interface LoginService {
    Login findByUsername(String username);
}
