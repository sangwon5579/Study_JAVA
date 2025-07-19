package com.beyond.inter.practice;

public class SmartPhone extends Product implements Basic {
    private String mobileAgency;    //통신사

    public SmartPhone() {
    }

    public SmartPhone(String code, String name, String brand, int price, String mobileAgency) {
        this.setCode(code);
        this.setName(name);
        this.setBrand(brand);
        this.setPrice(price);
        this.mobileAgency = mobileAgency;
    }

    public String getMobileAgency() {
        return mobileAgency;
    }

    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }

    @Override
    public void turnOn() {
        System.out.println("smartphone is on");
    }

    @Override
    public void turnOff() {
        System.out.println("smartphone is off");
    }
    @Override
    public String toString() {
        return "SmartPhone{" +
                "mobileAgency='" + mobileAgency + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }


}
