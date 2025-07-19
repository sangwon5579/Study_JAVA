package com.beyond.inter.practice;

public class Television extends Product implements Basic{

    private int inch;       //인치

    public Television() {
    }

    public Television(String code, String name, String brand, int price, int inch) {
        super.code = code;
        super.name = name;
        super.brand = brand;
        super.price = price;
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }


    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is off");
    }


    @Override
    public String toString() {
        return "Television{" +
                "inch=" + inch +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }


}
