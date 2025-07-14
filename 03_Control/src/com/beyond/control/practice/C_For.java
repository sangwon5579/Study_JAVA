package com.beyond.control.practice;

import java.util.Scanner;

public class C_For {
    /*
    for 문
        [표현법]
            for (초기식; 조건식; 증감식) {
                ...
            }
     */
    public void method1(){
        int result = 0;
        for (int i = 0; i<=10; i++){
            result += i;
        }
        System.out.printf("1~10까지 합 : %d\n", result);
    }
    public void method2() {
        int random = 0;
        int sum = 0;

        //java.lang.Math 클래스에서 제공하는 random() 메소드를 사용해서 랜덤값을 생성할 수 있다.
        System.out.println(Math.random());

    }
}
