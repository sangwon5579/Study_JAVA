package com.beyond.inter;

import com.beyond.inter.practice.Basic;
import com.beyond.inter.practice.Desktop;
import com.beyond.inter.practice.SmartPhone;
import com.beyond.inter.practice.Television;

public class Application {
    public static void main(String[] args) {
        //인터페이스는 객체 생성이 불가능하다
        //Basic basic = new Basic();

        //인터페이스는 참조 변수로 사용이 가능하다
        //다형성을 적용해서 인터페이스를 구현하는 객체들을 참조할 수 있다.
        Basic basic = new SmartPhone("a111","iphone 15","apple", 13000000, "KT");

        basic.turnOn();
        basic.turnOff();
        System.out.println();

        // 배열의 다형성
        Basic[] products = {
                new Desktop(),
                new SmartPhone(),
                new Television(),
                new Desktop()
        };

        for (Basic product : products) {
            System.out.println(product);
            product.turnOn();
            product.turnOff();
        }
    }
}
