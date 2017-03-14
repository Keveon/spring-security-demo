package com.keveon.service.impl;

import com.keveon.model.bo.Login;
import com.keveon.repository.UserRepository;
import com.keveon.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Keveon on 2017/3/10.
 * Login service implement
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LoginServiceImpl implements LoginService {
    private final UserRepository userRepository;

    @Override
    public Login findByUsername(String username) {
        return new Login(userRepository.findByUsername(username));
    }
}
