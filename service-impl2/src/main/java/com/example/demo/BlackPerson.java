package com.example.demo;

import com.v5ba.api.Person;
public class BlackPerson implements Person {
    @Override
    public String sayHello(String name) {
        return "我是BlackPerson, 你是:"+name;
    }
}
