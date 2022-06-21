package com.example.anywhere.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){

    }

}
