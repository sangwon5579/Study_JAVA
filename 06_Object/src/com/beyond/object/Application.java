package com.beyond.object;

import com.beyond.object.practice.Person;

public class Application {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("홍길동");
        person.setAge(30);
        person.whoAreYou();

    }
}
