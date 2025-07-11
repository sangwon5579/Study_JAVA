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
    public void method2() {
        int number1 =10;
        int number2 =20;
        int number3 =30;


        System.out.println(number1++);      //10(11)
        System.out.println((++number1) + (number2++));      //12+20(21)
        System.out.println((number1++) + (--number2) + (--number3));    //12+20+29

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
