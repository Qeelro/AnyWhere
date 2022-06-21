package com.example.anywhere.model;

import javax.persistence.*;

@Entity(name = "USERS")
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

    public User() {
    }

    public User(Long id, String nickName, String email, String password, String role) {
        this.id = id;
        this.nickName = nickName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
