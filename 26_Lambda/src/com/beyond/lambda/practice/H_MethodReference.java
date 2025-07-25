package com.beyond.lambda.practice;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

/*
# 메소드 참조

- 메소드를 참조해서 매개변수의 정보 및 리턴 타입을 알아내고, 람다식에서 불필요한 매개변수를 제거하는 것이 목적
- 자바 8부터 도입되어 기본 메소드나 생성자를 참조해서 함수적 인터페이스의 구현 객체를 생성한다
 */
public class H_MethodReference {
    public void method1(){
        System.out.println("hello");
        //정적 메소드 참조
        //  -클래스 이름 뒤에 ::붙이고 정식 이름을 기술하면 된다
//        IntBinaryOperator intBinaryOperator = (a,b) -> {
//            return Math.max(a, b);
//        };

        IntBinaryOperator intBinaryOperator = Math::max;
        System.out.println(intBinaryOperator.applyAsInt(10,24));

        //객체의 메소드 참조
        //참조 변수 뒤에 :: 붙이고 메소드 이름을 기술하면 된다
//        Consumer<String>consumer = (String str) ->  System.out.println(str);
        Consumer<String>consumer = System.out::println;
        consumer.accept("hello");
        System.out.println();

        String str = "hello";
        Supplier<Integer> supplier =str::length;
        System.out.println(supplier.get());

        //매개변수의 메소드 참조
        // - 매개변수의 클래스 이름 뒤에 :: 붙이고 메소드 이름을 기술하면 된다
        Function<Student, String> function = Student::getName;
        System.out.println((function.apply(new Student("이몽룡",24))));

        //생성자 참조
        // - 클래스 이름 뒤에 :: 붙이고 new 연산자 기술하면 된다
        Supplier<Student> studentSupplier = () ->  new Student();
        System.out.println(studentSupplier.get());
        System.out.println();
    }
}
