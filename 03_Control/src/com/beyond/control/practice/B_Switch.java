package com.beyond.control.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class B_Switch {
    /*
    switch 문
        [표현식]
            switch (값) { //정수, 문자, 문자열
                case: 값:
                    ...
                    break;
                case : 값:
                    ...
                    brak;
                default:
                    ...
     */
    public void method1() {
        String str = "";
        int price = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("과일 이름 > ");
        str = scanner.next();
        switch (str) {
            case "포도" :
                price = 5000;
                break;
            case "사과" :
                price = 2000;
                break;
            case "복숭아" :
                price = 3500;
                break;
            default:
                System.out.println("판매하지 않는 과일");
                return;  //실행 흐름을 메소드를 호출한 쪽으로 돌려준다.
        }
        System.out.printf("%s의 가격은 %d입니다 \n", str, price);
    }

    public void method2() {
        int month = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~12 월 중 입력 > ");
        month = scanner.nextInt();
        if(!((month >= 1) && (month <= 12))){
            System.out.println("다시 입력'");
            return;

        }

        switch (month) {
            case 1, 3, 5, 7,8, 10,  12 :
                System.out.printf("%d월은 31일 까지입니다.", month);
                break;
            case 4, 6, 9, 11:
                System.out.printf("%d월은 30일까지입니다", month);
                break;
            case 2:
                System.out.println("2월은 28 or 29일까지입니다.");
                break;
        }
    }

    public void practice(){
        int num1 = 0;
        int num2 = 0;
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번쨰수 > ");
        num1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("두번쨰수 > ");
        num2 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("연산자입력(+, -. *, /) > ");
        ch = scanner2.next().charAt(0);

        if (ch != '+' && ch != '-' && ch != '/' && ch != '*') {
            System.out.println("연산자를 잘못 입력하셨습니다.");
            return;
        }

        int answer = 0;
        switch (ch) {
            case '+' :
                answer = num1 + num2;
                break;
            case '-' :
                answer = num1 - num2;
                break;
            case '/' :
                answer = num2 / num1;
                break;
            case '*' :
                answer = num1 * num2;
                break;
        }
        System.out.println(num1 + " " + ch + " " + num2 + " = " + answer);

    }
}
