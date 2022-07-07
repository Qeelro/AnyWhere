package com.example.anywhere.controller;

import com.example.anywhere.model.Event;
import com.example.anywhere.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    private final EventService eventService;

    public HomeController(EventService eventService) {
        this.eventService = eventService;
    }

//    @GetMapping("/")
//    public String getHome(Model model) {
//        List<Event> eventList = eventService.getAllEvent();
//        model.addAttribute("event", eventList);
//        return "home";
//    }
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String viewHomePage(Model model, Event event, String keyword) {
        if(keyword!=null) {
            List<Event> list = eventService.getByKeyword(keyword);
            model.addAttribute("event", list);
        }else {
            List<Event> list = eventService.getAllEvent();
            model.addAttribute("event", list);}
        return "home";
    }

}
