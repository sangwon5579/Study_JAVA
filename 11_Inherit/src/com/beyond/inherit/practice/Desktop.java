package com.beyond.inherit.practice;

public class Desktop extends Product{
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
}
