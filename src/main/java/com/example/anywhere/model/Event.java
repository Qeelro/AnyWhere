package com.example.anywhere.model;

import javax.persistence.*;
import java.time.LocalDate;

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
    private LocalDate dateStart;

    @Column(name = "DATE_END")
    private LocalDate dateEnd;

    @Column(name = "COUNTER")
    private Long counter;

    @ManyToOne
    private User user;

    public Event() {
    }

    public Event(Long id, String nameEvent, String description, LocalDate dateStart, LocalDate dateEnd, Long counter,
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

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
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
