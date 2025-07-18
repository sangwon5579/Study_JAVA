package com.beyond.polymorphism;

import com.beyond.polymorphism.practice.Desktop;
import com.beyond.polymorphism.practice.Product;
import com.beyond.polymorphism.practice.SmartPhone;
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

        // 4. 배열과 다형성
        // 1) 다형성을 적용하기 전
        Desktop[] desktops = new Desktop[2];
        desktops[0] = new Desktop();
        desktops[1] = new Desktop();

        SmartPhone[] smartPhones = {
                new SmartPhone(),
                new SmartPhone(),
        };

        // 2) 다형성을 적용한후
        Product[] products = {
                new Desktop(),
                new Desktop(),
                new SmartPhone(),
                new SmartPhone(),
                new Television()
        };

        for(Product p : products){
            System.out.println(p);

            if(p instanceof Desktop){
                System.out.println(((Desktop)p).isAllInOne());
            }
            else if(p instanceof SmartPhone){
                System.out.println(((SmartPhone) p ).getMobileAgency());
            }
            else if (p instanceof Television){
                System.out.println(((Television) p).getInch());
            }

            System.out.println();
        }

        // 5. 매개변수의 다형성
        productInfo(new Desktop());
        productInfo(new SmartPhone());
        productInfo(new Television());
    }
//    public static void productInfo(Desktop desktop){
//        System.out.println(desktop);
//    }
//
//    public static void productInfo(SmartPhone smartPhone){
//        System.out.println(smartPhone);
//    }
//
//    public static void productInfo(Television television){
//        System.out.println(television);
//    }
    public static void productInfo(Product product){
        System.out.println(product);
    }
}
