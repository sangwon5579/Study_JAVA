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
        //random 메소드는 호출 시 0~0.99999999.. 사이의 랜덤값을 발생(0<=랜덤값<1.0)
        //System.out.println(Math.random()*10+1); //1.0 ~ 10.9999999999...
        //System.out.println((int)(Math.random()*10+1)); //1~10
        random = ((int)(Math.random()*10+1));
        for(int i = 1; i <= random; i++){
            sum += i;
        }
        System.out.printf("1~%d 까지의 합 : %d", random, sum);
    }
    public void method3() {
        for(int i = 2; i<=9; i++){
            System.out.printf("%d단 \n", i);
            for(int j = 1; j<=9; j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
            System.out.println();
        }
    }
}
