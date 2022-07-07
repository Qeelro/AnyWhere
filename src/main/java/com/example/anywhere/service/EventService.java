package com.example.anywhere.service;

import com.example.anywhere.model.Event;
import com.example.anywhere.model.User;
import com.example.anywhere.repository.EventRepository;
import com.example.anywhere.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private EventRepository eventRepository;
    private UserRepository userRepository;


    public EventService(EventRepository eventRepository, UserRepository userRepository) {
        this.eventRepository = eventRepository;
        this.userRepository = userRepository;
    }

    public Event saveEvent(Event event, Principal principal) {
        String name = principal.getName();
        User byNickName = userRepository.findByNickName(name);
        event.setUser(byNickName);
        return eventRepository.save(event);
    }

    public List<Event> getAllEvent() {
        return eventRepository.findAll();

    }

    public void saveEditEvent(Event event) {
        eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    public List<Event> getByKeyword(String keyword) {
        return eventRepository.findByKeyword(keyword);
    }
}
