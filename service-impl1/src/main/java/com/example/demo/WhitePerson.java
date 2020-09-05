package com.example.demo;

import com.v5ba.api.Person;
public class WhitePerson implements Person {
    @Override
    public String sayHello(String name) {
        return "我是WhitePerson, 你是:"+name;
    }
}
