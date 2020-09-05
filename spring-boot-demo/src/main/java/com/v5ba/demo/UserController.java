package com.v5ba.demo;

import com.v5ba.api.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private Person person;
    @GetMapping("hello")
    public String hello(){
        return person.sayHello("张三");
    }
}
