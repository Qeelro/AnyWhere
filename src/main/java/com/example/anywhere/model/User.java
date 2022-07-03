package com.example.anywhere.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NICK_NAME")
    private String nickName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD", length = 64)
    private String password;

    @Column(name = "ROLE")
    private String role;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<Event> eventList;

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

    public List<Event> getEvents() {
        return eventList;
    }

    @Override
    public String toString() {
        return nickName;
    }
}
