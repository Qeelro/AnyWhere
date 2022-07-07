package com.example.anywhere.controller;

import com.example.anywhere.model.Event;
import com.example.anywhere.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
import java.util.Optional;

@Controller
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/event/{id}")
    public String getEvent(@PathVariable("id") Long id, Model model) {
        Optional<Event> event = eventService.getEventById(id);
        model.addAttribute("event", event.orElseThrow()); // kontroler advice  @ControllerAdvice () -> new ElementNotFoundException("message")
        return "event";
    }

    @GetMapping("/addEvent")
    public String getAddEvent() {
        return "/addEvent";
    }

    @PostMapping("/addEvent")
    public RedirectView postAddEvent(Event event, Principal principal) {
        principal.getName();
        eventService.saveEvent(event, principal);
        return new RedirectView("/");
    }

    @GetMapping("/editEvent/{id}")
    public String getEditEvent(@PathVariable("id") Long id, Model model) {
        Optional<Event> event = eventService.getEventById(id);
        model.addAttribute("event", event.orElseThrow());
        return "/editEvent";
    }

    @PostMapping("/editEvent/{id}")
    public RedirectView postEditEvent(Event event, @PathVariable("id") Long id) {
        eventService.saveEditEvent(event);
        return new RedirectView("/editEvent/{id}");
    }

}
