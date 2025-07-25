package com.beyond.lambda.practice;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class G_Predicate {
    /*
        predicate
            - predicate 함수적 인터페이스는 매개변수와 boolean 값을 리턴하는 test() 추상 메소드를 가지고 있다.
            - test() 추상 메소드는 매개값을 조사해서 true/false를 리턴하는 역할을 한다.
     */
    public void method1(){
        //Predicate<T> : T 타입의 객체를 조사해서 true 또는 false를 리턴한다
        Predicate<String> predicate = (str) ->str.equals("홍길동");
        System.out.println(predicate.test("홍길동"));
        System.out.println(predicate.test("이몽룡"));
        System.out.println();

        //BiPredicate<T, U> : T 타입의 객체와 U 타입의 객체를 조사해서 true 또는 false를 리턴한다
//        BiPredicate<String, String> biPredicate = ( str1,  str2) -> str1.equals(str2);
        BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("홍길동", "홍길동"));
        System.out.println(biPredicate.test("홍길동", "이몽룡"));

        //IntPredicate : int 타입의 값을 조사해서 true 또는 false를 리턴한다
        IntPredicate intPredicate =a -> a%2==0;
        System.out.println(intPredicate.test(11));
        System.out.println(intPredicate.test(12));
    }
}
