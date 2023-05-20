package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}/{id2}")
    public String pathvariable(@PathVariable String id, @PathVariable(name = "id2") String id2){
        return "The path variable is: id " + id + " and id2 "+ id2;
    }

    //when the data is mentatory use pathvariable and if the data is not mentatory then use requestparam
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name, @RequestParam(name = "age", required = false) Integer age) {
        return "Your name is : " + name + " and age " + age;
    }
}
