package com.example.anywhere.service;

import com.example.anywhere.model.User;
import com.example.anywhere.repository.UserRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void saveEditUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        saveUser(new User(1L, "PrivateWolf", "corene12@yahoo.com", "ElM5T@jgm!7E", "user"));
        saveUser(new User(2L, "BrutalGenie", "carolina18@gmail.com", "Ew%nSrCtv@Bw", "user"));
        saveUser(new User(3L, "DadOfTheDead", "faustino_zulauf@yahoo.com", "s!masNM06qS#", "admin"));
        saveUser(new User(4L, "Scoundrella", "deondre_kuphal@yahoo.com", "7pgv1^TDu4nr", "moderator"));
        saveUser(new User(5L, "AstroBoy", "jettie97@hotmail.com", "E!D5Gt#yz!XO", "user"));
        saveUser(new User(6L, "Reformer", "katrine.green99@yahoo.com", "YSdWdS$giHgx", "user"));
        saveUser(new User(7L, "Quern", "aleen31@hotmail.com", "4mrn&&2s0Eyn", "user"));
        saveUser(new User(8L, "MuttonChops", "preston61@yahoo.com", "hVfK$^Vgd%xZ", "user"));
        saveUser(new User(9L, "CitarNosis", "jarrell_kuhic@gmail.com", "HdNY7ZS8AtU$", "user"));
        saveUser(new User(10L, "Margary", "zoe43@gmail.com", "UDmNTCk$8&LX", "user"));
    }

}
