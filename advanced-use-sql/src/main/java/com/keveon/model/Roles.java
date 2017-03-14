package com.keveon.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Keveon on 2017/2/19.
 * Role bean
 */
@Entity
@Table(name = "user_roles")
@RequiredArgsConstructor
@Data
public class Roles implements Serializable {
    private static final long serialVersionUID = 9066555364242488524L;

    /**
     * 角色编号
     */
    @Id
    @Column(name = "user_role_id")
    Integer id;

    /**
     * 用户名
     */
    @OneToOne
    @JoinColumn(name = "username")
    User user;

    /**
     * 角色
     */
    @Column(name = "role", length = 50)
    String role;
}
