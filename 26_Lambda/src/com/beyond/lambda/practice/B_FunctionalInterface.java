package com.beyond.lambda.practice;

import com.beyond.lambda.practice.functional.A_Functional;

public class B_FunctionalInterface {
    public void method1(){
        A_Functional fi;

        fi = () -> {
            System.out.println("매개변수와 반환값이 없는 람다식 1");
        };

        fi = () -> System.out.println("매개변수와 반환값이 없는 람다식 1");
        
        fi.execute();
    }
}
