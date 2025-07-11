package com.beyond.operator.practice;

import java.util.Scanner;

public class E_Logical {
    public void method1() {
        //사용자가 입력한 정수값이 1~100 사이의 정수값인지 확인
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number > ");
        int number = scanner.nextInt();
        if ((number >= 1) && (number <= 100)){
            System.out.println("1~100 사이의 정수");
        }
        else{
            System.out.println("1~100 사이의 정수가 아님");
        }
    }
    public void method2() {
        //short cut 연산 테스트
        //단락 회로 평가
        int number = 10;
        boolean result = false;
        System.out.println("&& 연산 전 number : "+ number);
        result = ((number < 5) && (++number > 0));
        //&& 연산자를 기준으로 앞에서 False가 나왔기 때문에 뒤의 연산은 수행하지 않는다
        System.out.println("result : " + result);
        System.out.println("&& 연산 후 number : "+ number);
        System.out.println();
        /*
        && 연산 전 number : 10
        result : false
        && 연산 후 number : 10
         */

        System.out.println("|| 연산 전 number : "+ number);
        result = ((number < 20) || (++number > 0));
        // || 연산자를 기준으로 앞에서 이미 true가 나왔기 때문에 뒤의 연산은 수행하지 않는다.
        System.out.println("result : " + result);
        System.out.println("|| 연산 후 number : "+ number);
        /*
        || 연산 전 number : 10
        result : true
        || 연산 후 number : 10
         */
    }
}
