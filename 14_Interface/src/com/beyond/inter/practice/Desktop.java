package com.beyond.inter.practice;

public class Desktop extends Product {
    private boolean allInOne; //일체 여부

    public Desktop() {
        //super(); 가 생략되어 있음
        System.out.println("자식 클래스의 기본 생성자 호출");
    }

    public Desktop(String code, String name, String brand, int price, boolean allInOne) {
        super(code, name, brand, price);
        this.allInOne = allInOne;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }


    @Override
    public void turnOn() {
        System.out.println("데스크탑을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("데스크탑을 끕니다");
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "allInOne=" + allInOne +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }


}
