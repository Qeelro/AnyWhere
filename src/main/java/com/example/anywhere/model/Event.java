package com.example.anywhere.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME_EVENT")
    private String nameEvent;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name = "DATE_START")
    private String dateStart;

    @Column(name = "DATE_END")
    private String dateEnd;

    @Column(name = "COUNTER")
    private Long counter;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
    List<Happening> happeningList;

    @ManyToOne
    private User user;

    public Event() {
    }

    public Event(Long id, String nameEvent, String description, String dateStart, String dateEnd, Long counter,
                 User user) {
        this.id = id;
        this.nameEvent = nameEvent;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
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

    public List<Happening> getComments() {
        return happeningList;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", nameEvent='" + nameEvent + '\'' +
                ", description='" + description + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", counter=" + counter +
                ", user=" + user +
                '}';
    }
}
