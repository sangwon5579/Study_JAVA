package com.beyond.variable.practice;

import java.util.Scanner;

public class C_ConsoleInput {
    public void keyboardInput() {
        //콘솔에 데이터를 입력받을 때는 System.in을 사용한다
        //Scanner 클래스
        // ~사용자로부터 입력되는 정수, 실수, 문자열을 읽어오는 클래스이다
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        double height = 0;
        char gender = '\u0000';

        System.out.print("please enter your name: ");
        name = scanner.nextLine();

        System.out.print("please enter your age: ");
        age = scanner.nextInt();

        System.out.print("please enter your height: ");
        height = scanner.nextDouble();

        System.out.print("please enter your gender(M/F): ");
        gender = scanner.next().charAt(0);

        System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f, 성별 : %c\n", name, age, height,  gender);
    }
}
