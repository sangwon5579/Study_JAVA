package com.beyond.operator.practice;

public class F_Assignment {
    public void method1(){
        int number = 12;

        number += 3;
        System.out.println(number); //15

        number -= 3;
        number *= 2;
        System.out.println(number); //24

        number /= 2;
        System.out.println(number); //12

        number %= 2;
        System.out.println(number); //0

        String str = "Hello";
        str += "World";
        System.out.println("str += \"World\"은 : " + str);
    }
}
