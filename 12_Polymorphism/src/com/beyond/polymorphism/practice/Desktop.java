package com.beyond.polymorphism.practice;

public class Desktop extends Product{
    private boolean allInOne; //일체 여부

    public Desktop() {
        //super(); 가 생략되어 있음
        System.out.println("자식 클래스의 기본 생성자 호출");
    }

    public Desktop(String code, String name, String brand, int price, boolean allInOne) {
        // 부모 필드를 초기화할 수 있는 방법
        // 1) 부모의 생성자를 호출해서 초기화
        super(code, name, brand, price);

        // 2) 부모의 Setter 메소드를 호출해서 초기화
//        this.setCode(code);
//        this.setName(name);
//        setBrand(brand);
//        super.setPrice(price);

        // 3) 부모의 필드에 직접 접근해서 초기화 (protected 접근 제한자 사용)
//        this.code = code;
//        this.name = name;
//        super.price = price;

        this.allInOne = allInOne;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
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
