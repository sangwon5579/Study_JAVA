package com.beyond.inherit.practice;

public class Television extends Product {

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
    public String information(){
        return String.format("%s, %d\n", super.information(), inch);
    }
}
