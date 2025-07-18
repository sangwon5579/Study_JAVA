package com.beyond.polymorphism;

import com.beyond.polymorphism.practice.Desktop;
import com.beyond.polymorphism.practice.Product;
import com.beyond.polymorphism.practice.Television;

public class Application {
    public static void main(String[] args) {
        // 1. 부모 타입의 참조 변수로 부모객체를 다루는 경우
        Product product = new Product();

        //Product 참조 변수로 product 클래스의 맴버만 접근 가능
        System.out.println(product);
        System.out.println();

        // 2. 자식 타입의 참조 변수로 자식 객체를 다루는 경우
        Desktop desktop = new Desktop("a1111", "아이맥 24인치", "애플", 1800000, true);

        // desktop 참조 변수로 Product, Desktop 클래스의 맴버에 접근 가능
        System.out.println(desktop);

        // 3. 부모 타입의 참조 변수로 자식 타입의 객체를 다루는 경우
        Product television = new Television("a33333", "애플TV","애플", 1800000,24);

        // television 참조 변수로 Product 클래스의 맴버만 접근가능
        // 단, 자식클래스에서 메소드가 오버라이딩 되었다면 자식클래스의 메소드가 대신 호출된다
        System.out.println(television);
        // 다시 Television 클래스의 맴버에 접근하고 싶으면 형 변환을 해야한다.
        System.out.println(((Television)television).getInch());
    }
}
