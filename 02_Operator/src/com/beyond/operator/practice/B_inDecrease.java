package com.beyond.operator.practice;

public class B_inDecrease {
    public void method1() {
        int number = 10;

        //전위연산
        System.out.println("num : " + number);
        System.out.println("1회수행 후" + ++number);
        System.out.println("num : " + number);
        System.out.println();

        //후위연산
        System.out.println("num : " + number);
        System.out.println("1회수행 후" + number--);
        System.out.println("num : " + number);
        System.out.println();

    }
}
