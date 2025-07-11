package com.beyond.variable.practice;

public class B_ConsoleOutput {
    public void valuePrint(){
        //자바는 콘솔(Console)에 데이터를 출력할 때 System.out을 사용한다.
        // 1. System.out.print() 메소드
        // ~ ()안의 값을 콘솔에 출력해주는 메소드
        System.out.print("Hello World");
        System.out.print(123);
        System.out.print(true);
        System.out.println();

        // 2.  System.out.println() 메소드
        // ~ print()와 동일. + 즐바꿈
        System.out.println("Hello World");
        System.out.println(123);
        System.out.println(false);
        System.out.println();

        // 3. System.ouy.printf() 메소드
        // ~ 정해져 있는 서식에 맞춰서 그 서식에 맞는 값을 줄바꿈하지 않고 출력해주는 메소드

        // *서식 지정자
        // %d : 정수형, %f : 실수형, %b : 논리형, %c : 문자형, %s : 문자열

        // * escape 문자
        // \n : 줄바꿈, \t : 수평 탭, \" : 큰 따옴표 출력.\' : 작은 따옴표 출력
        System.out.printf("%d\n", 10);
        System.out.printf("%d + %d = %d\n", 100, 200, (100+200));
        System.out.printf("%f\t%f\n", 3.141592, 4.14159);
        System.out.printf("%.2f\t%.3f\n", 3.141592, 4.14159);
        System.out.printf("%c %s\n", 'A', "\"hellooooooo\"");
    }
}
