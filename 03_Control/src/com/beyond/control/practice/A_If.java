package com.beyond.control.practice;

import java.util.Scanner;

public class A_If {
    /*
    if문
        [표현법]
            if (조건식) {
                ...
            } else {
                ...
            };
     */
    public void method1(){
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수값 입력 > ");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.printf("%d는 짝수입니다.", number);
        } else {
            System.out.printf("%d는 홀수입니다.", number);
        }
        System.out.println();
    }

    public void method2(){
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력 > ");
        str = scanner.next();
        if ("홍길동".equals(str)) {
            System.out.println("홍길동");
        }
        else {
            System.out.println("NOT 홍길동");
        }
    }

    public void method3(){
        char alphabet = '\u0000';
        Scanner scanner = new Scanner(System.in);
        System.out.print("알파벳 입력 > ");
        alphabet = scanner.next().charAt(0);

        /*
        if (Character.isUpperCase(alphabet)){
            System.out.println("대문자");
        }
        else{
            System.out.println("소문자");
        }
         */
        if ((alphabet>='A') && (alphabet<='Z')) {
            System.out.printf("대문자 %c \n", alphabet);
        }
        else {
            System.out.printf("소문자 %c \n", alphabet);
        }
    }

    public void practice() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 입력 > ");
        score = scanner.nextInt();
        char grade;
        if (score >= 90) {
            grade = 'A';
            System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다.", score, grade);
        } else if (score >= 80) {
            grade = 'B';
            System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다.", score, grade);
        } else if (score >= 70) {
            grade = 'C';
            System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다.", score, grade);
        } else if (score >= 60) {
            grade = 'D';
            System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다.", score, grade);
        } else {
            grade = 'F';
            System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다.", score, grade);
        }
    }
}
