package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "Hello World!!!";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Fazal Haroon");
        user.setEmailId("fazaltuts4u@gmail.com");
        return user;
    }
}
