package com.keveon.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Keveon on 2017/2/19.
 * User bean
 */
@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 4027515435011174332L;

    /**
     * 用户名
     */
    @Id
    @Column(name = "username", nullable = false, length = 50)
    String username;

    /**
     * 密码
     */
    @Column(name = "password", nullable = false, length = 50)
    String password;

    /**
     * 是否启用
     */
    @Column(name = "enabled", nullable = false)
    Boolean enabled;
}
