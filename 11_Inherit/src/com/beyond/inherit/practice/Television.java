package com.beyond.inherit.practice;

public class Television {
    private String code;    //상품 코드

    private String name;    //상품 이름

    private String brand;   //브랜드

    private int price;   //상품 가격

    private int inch;       //인치

    public Television() {
    }

    public Television(String code, String name, String brand, int price, int inch) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.inch = inch;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public String information(){
        return String.format("code: %s, name : %s, brand : %s, price : %d, inch : %d\n", code, name, brand, price, inch);
    }
}
