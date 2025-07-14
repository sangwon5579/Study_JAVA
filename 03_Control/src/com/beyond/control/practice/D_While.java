package com.beyond.control.practice;

import java.util.Scanner;

public class D_While {
    /*
    while 문
        [표현법]
            while (조건식){
                ...
                [증감식, 분기문]
            }
     */
    public void method1(){
        int random = (int) (Math.random()*10+1);
        int i = 1;
        int sum = 0;
        while(i <= random){
            sum += i;
            i++;
        }
        System.out.printf("%d까지 합 : %d",random, sum);
    }
    public void method2(){
        String str = "";
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("입력 : ");
            str=scanner.next();
            System.out.println(str);
            if(str.equals("exit")){
                return;
            }
        }
    }
}
