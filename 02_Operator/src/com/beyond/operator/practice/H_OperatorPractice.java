package com.beyond.operator.practice;

import java.util.Scanner;

public class H_OperatorPractice {
    public void practice1(){
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하시오.. > ");
        char ch = scanner.next().charAt(0);
        result = (ch>=65 && ch<90) ? true : false;
        System.out.println("사용자가 입력한 값이 대문자입니까? : " + result);
        System.out.println();
    }
    public void practice2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수값 입력 > ");
        int number1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("두번째 정수값 입력 > ");
        int number2 = scanner1.nextInt();
        int result = number1 * number2;
        if (result > 100){
            System.out.println("결과가 100 이상입니다");
        }
        else{
            System.out.println("결과가 100보다 작습니다.");
        }
        System.out.println();
    }
    public void practice3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하시오... > ");
        char cd = scanner.next().charAt(0);
        if (cd >= 65 && cd <= 90){
            System.out.println("알파벳 대문자이다.");
        }
        else{
            System.out.println("알파벳 소문자이다.");
        }
        System.out.println();
    }
    public void practice4(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 > ");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("두번째 정수 입력 >");
        int number2 = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("+ or - 를 입력하시오 >");
        char ch = scanner3.next().charAt(0);
        if(ch != '+' && ch != '-'){
            System.out.println("잘못 입력했습니다.");
        }
        else if (ch == '+') {
            int result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        }
        else{
            int result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        }
        System.out.println();
    }
    public void practice5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하시오.. > ");
        int number1 = scanner.nextInt();
        if (number1 % 2 == 0){
            System.out.println("짝수이다");
        }
        else{
            System.out.println("홀수이다");
        }
    }
    public void practice6(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("사람수를 입력하시오 : ");
        int people = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("사탕 수를 입력하시오 : ");
        int candy = scanner1.nextInt();
        int result1 = people / candy;
        int result2 = people % candy;
        System.out.println("1인당 소유 사탕 개수 : " + result1);
        System.out.println("남은 사탕 개수 : " + result2);
    }
    public void practice7(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("국어 점수 입력 : ");
        int korean = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("영어 점수 입력 : ");
        int eng = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("수학 점수 입력 : ");
        int math = scanner3.nextInt();
        int sum = korean + eng + math;
        int avg = (korean + eng + math) / 3;
        System.out.println("합계 점수 : " + sum);
        System.out.println("평균 : " + avg);
    }
    public void practice8(){
        
    }
    public void practice9(){

    }
}
