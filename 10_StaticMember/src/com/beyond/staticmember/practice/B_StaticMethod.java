package com.beyond.staticmember.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class B_StaticMethod {
    private static int number1 = 10;
    private static int number2 = 20;
    private int number3 = 30;
    //1. 매개변수와 반환값이 없는 정적 메소드
    public static void method1(){
        System.out.println(number1 + B_StaticMethod.number2);

        //정적 메소드에서는 필드에 접근할 수 없다
        //정적 메소드는 객체를 생성하지 않고 사용하기 때문에 필드에 접근할 수 없다.
//        System.out.println(number3);
    }

    //2. 매개변수가 없고 반환값이 있는 정적 메소드
    public static int method2(){
        int number = 10;
        int number2 = 40;
        //정적 메소드에서는 this를 사용할 수 없다.
        return B_StaticMethod.number1 + B_StaticMethod.number2;
    }

    //3. 매개변수가 있고 반환값이 없는 정적 메소드
    public static void method3(int number){
        System.out.println(method2() + number);
    }

    //4. 매개 변수가 있고 반환값도 있는 정적 메소드
    public static int method4(int... numbers) {

        return Arrays.stream(numbers).sum();
    }
}

