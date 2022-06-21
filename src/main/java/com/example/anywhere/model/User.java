package com.example.anywhere.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NICK_NAME", length = 15)
    private String nickName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD", length = 64)
    private String password;

    @Column(name = "ROLE")
    private String role;

    @OneToMany
    private Happening happening;

}
