package com.example.anywhere.service;

import com.example.anywhere.model.Event;
import com.example.anywhere.repository.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private EventRepository eventRepository;


    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public void saveEditEvent(Event event) {
        eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

}
