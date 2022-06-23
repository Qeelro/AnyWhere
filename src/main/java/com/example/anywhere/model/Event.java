package com.example.anywhere.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME_EVENT")
    private String nameEvent;

    @Column(name = "DATE")
    private LocalDate date;

    @Column(name = "COUNTER")
    private Long counter;

    @OneToOne
    private User user;

    public Event() {
    }

    public Event(Long id, String nameEvent, LocalDate date, Long counter, User user) {
        this.id = id;
        this.nameEvent = nameEvent;
        this.date = date;
        this.counter = counter;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
