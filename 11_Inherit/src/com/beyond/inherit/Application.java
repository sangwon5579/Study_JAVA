package com.beyond.inherit;

import com.beyond.inherit.practice.Book;
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

        //object 클래스의 메소드 오버라이딩
        Book book1 = new Book("자바의 정석", "남궁성", 300000);
        Book book2 = new Book("자바의 정석", "남궁성", 300000);
        Book book3 = new Book("자바", "남궁성", 300000);

//        System.out.println(book1.toString());
//        System.out.println(book2.toString());
//        System.out.println(book3.toString());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);


        // 2. equals() 테스트
        System.out.println(book1 == book2); //주소 비교
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));

        System.out.println("홍길동".hashCode());
        System.out.println(new String("홍길동").hashCode());

        // 3. hashcode() 테스트
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}
