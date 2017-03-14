package com.keveon.model.bo;

import com.keveon.model.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

import static java.util.Objects.isNull;

/**
 * Created by Keveon on 2017/3/10.
 * Login business object
 */
@Data
@RequiredArgsConstructor
public class Login {

    final User user;

    public Login() {
        this(null);
    }

    public Login get() {
        return this.orElseThrow(() -> new IllegalStateException("没登录"));
    }

    public Integer getId() {
        return this.user.getId();
    }

    public String getUsername() {
        return this.user.getUsername();
    }

    public String getPassword() {
        return this.user.getPassword();
    }

    public Login orElseThrow(Supplier<Exception> supplier) {
        if (isNull(this.user))
            supplier.get();
        return this;
    }
}