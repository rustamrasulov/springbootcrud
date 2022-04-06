package com.miirrr.springbootcrud.service;

import com.miirrr.springbootcrud.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserPostConstruct {

    private final UserService userService;

    private UserPostConstruct(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void postConstruct() {
        userService.saveUser(new User("Vasya", "Pupkin","pupkin@mail.ru"));
        userService.saveUser(new User("Che", "Gevara","che@aol.com"));
        userService.saveUser(new User("Mary", "Kuri","radiation@yandex.ru"));
        userService.saveUser(new User("Yosef", "Stalin","chairman@ussr.su"));
    }
}
