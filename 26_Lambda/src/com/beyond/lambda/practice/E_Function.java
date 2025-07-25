package com.beyond.lambda.practice;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class E_Function {
    /*
        Function
            - Function 표준 함수적 인터페이스는 매개값과 리턴값이 있는 apply() 추상 메소드를 가지고 있다
            - aapliy() 추상메소드는 주로 매개값을 리턴값으로 매핑(타입 변환)하는 역할을 한다
     */

    public void method1(){
        // Function<T, R> : T타입의 객체를 R타입의 객체로 매핑(타입 변환)한다
        Function<String, Integer> function;
        function =  str-> Integer.parseInt(str);
        System.out.println(function.apply("12345"));

        //BiFunction<T, U, R>: T타입의 객체와  U타입의 객체를 R타입의 객체로 매핑(타입변환)한다
        BiFunction<Integer, Double, String> biFunction;
        biFunction = (Integer i, Double d) -> String.format("%d + %.1f = %.1f",i,d,(i+d));

        System.out.println(biFunction.apply(10,3.14));

        BiFunction<String, Integer, Student> studentBifunction;
//        studentBifunction = (String name, Integer age) -> new Student(name, age);
        studentBifunction = Student::new;
        System.out.println(studentBifunction.apply("홍길동", 32));

        ToIntFunction<Student> studentToIntFunction;
        Student student = new Student("홍길동", 35, '남', 100, 80);

        //ToIntFunction<T> : T타입의 객체를 Int 타입의 값으로 매핑(타입 변환)한다
        // studentToIntFunction= s -> s.sum();
        studentToIntFunction= Student::sum;

        System.out.println(studentToIntFunction.applyAsInt(student));
    }
}
