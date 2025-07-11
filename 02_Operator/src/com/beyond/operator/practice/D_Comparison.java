package com.beyond.operator.practice;

import java.util.Scanner;

public class D_Comparison {
    public void method1(){
        int number1 = 10;
        int number2 = 25;
        boolean result = false;

        result = (number1 == number2);
        result = (number1 != number2);
        result = (number1 > number2);
        result = ('A' == 65); //t
        result = (3 == 3.0);  //t
        result =(1.0 == 1.0f); //t
        result = (0.1 == 0.1f); //f 오차는 소수점에서 생기는 거라
        //부동소수점 방식은 오차 생길 수 있기 때문에 대부분의 비교 연산에서는 정수 타입을 사용한다

        System.out.println("result = " + result);
    }
    public void method2(){
        /*
        산술 연산 + 비교 연산
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number > ");
        int number=scanner.nextInt();
        if (number%2==0){
            System.out.println("짝수");
        }
        else{
            System.out.println("홀수");
        }
    }
}
