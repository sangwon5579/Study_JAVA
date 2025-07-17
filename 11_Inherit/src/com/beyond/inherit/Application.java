package com.beyond.inherit;

import com.beyond.inherit.practice.Desktop;
import com.beyond.inherit.practice.SmartPhone;
import com.beyond.inherit.practice.Television;

public class Application {
    public static void main(String[] args) {
        //Desktop 객체 생성
        /*Desktop desktop = new Desktop("a111", "아이맥 24인치", "애플", 1800000, true);
        System.out.println(desktop.information());*/
        Desktop desktop = new Desktop();
        desktop.setCode("A1234");
        desktop.setBrand("애플");
        desktop.setName("아이맥 18인치");
        desktop.setPrice(1000000);
        desktop.setAllInOne(true);
        System.out.println(desktop.information());

        //smartphone 객체 생성
        SmartPhone smartphone = new SmartPhone("a2222", "아이폰15", "애플", 1200000,"KT");
        System.out.println(smartphone.information());

        //television 객체 생성
        Television television = new Television("a3333", "애플 TV", "애플", 1000000,30);
        System.out.println(television.information());
    }
}
