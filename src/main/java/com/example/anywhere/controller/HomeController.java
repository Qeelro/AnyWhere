package com.example.anywhere.controller;

import com.example.anywhere.model.Event;
import com.example.anywhere.service.EventService;
import com.example.anywhere.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private EventService eventService;
    private UserService userService;

    public HomeController(EventService eventService, UserService userService) {
        this.eventService = eventService;
        this.userService = userService;
    }


    @GetMapping("/home")
    public String getHome(Model model) {
        List<Event> eventList = eventService.getAllEvent();
        model.addAttribute("event", eventList);
        return "home";
    }

}