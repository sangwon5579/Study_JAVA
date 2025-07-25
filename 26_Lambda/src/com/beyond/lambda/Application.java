package com.beyond.lambda;
/*
    람다식(Lambda expressions)
        -자바에서 함수적 프로그래밍을 위해  자바8부터 람다식을 지원
        - 람다식은 매개변수를 가지는 함수와 같은 코드 블록이지만 런타임 시에는 인터페이스의 익명 구현 객체를 생성한다.

        [표현법]
            ([자료형 변수명...]) -> {
                //실행 코드
                [return 반환값;]
            };

            예시)
            () -> { ... }
            (int a) -> { System.out.println(a); }
            (a) -> { System.out.println(a); }
            a -> System.out.println(a);
            (int a, int b) -> { return a + b; }
            (a, b) -> { return a + b; }
            (a, b) -> a + b;

            메소드 참조
                - 메소드를 참조해서 매개변수의 정보 및 리턴 타입을 알아내고, 람다식에서 불필요한 매개변수를 제거하는 것이 목적
                - 자바 8부터 도입되어 기본 메소드나 생성자를 참조해서 함수적 인터페이스의 구현 객체를 생성한다


 */

import com.beyond.lambda.practice.*;

public class Application {
    public static void main(String[] args) {
        //람다식 테스트
//        new A_Lambda().method1();

        //함수적 인터페이스
//        new B_FunctionalInterface().method1();
//        new B_FunctionalInterface().method2();
//        new B_FunctionalInterface().method3();
//        new B_FunctionalInterface().method4(300);

        //표준 함수적 인터페이스
//        new C_Consumer().method1();
//        new D_Supplier().method1();
//        new E_Function().method1();
//        new F_Operator().method1();
//        new G_Predicate().method1();

        //메소드 참조
        new H_MethodReference().method1();
    }
}
