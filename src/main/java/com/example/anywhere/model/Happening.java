package com.example.anywhere.model;

import javax.persistence.*;

@Entity
public class Happening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TEXT", length = 5000)
    private String text;


    @ManyToOne
    private Event event;

    @ManyToOne
    private User user;

    public Happening() {
    }

    public Happening(Long id, String text, Event event, User user) {
        this.id = id;
        this.text = text;
        this.event = event;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Happening{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", event=" + event +
                ", user=" + user +
                '}';
    }
}
