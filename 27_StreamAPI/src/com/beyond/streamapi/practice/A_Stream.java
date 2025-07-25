package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    Stream의 종류
        - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있다.
        - Stream<T>, IntStream, LongStream, DoubleStream
 */
public class A_Stream {
    //숫자 범위로 스트림 생성
    public void method1(){
        int sum;
        IntStream stream;

        //첫번쨰 매개값 ~ 두번째 매개값 이전까지의 값을 요소로 가지는 스트림 객체를 생성한다
//        stream = IntStream.range(1, 10);

        //첫번쨰 매개값 ~ 두번째 매개값까지의 값을 요소로 가지는 스트림 객체를 생성한다
        stream = IntStream.rangeClosed(1, 10);

        sum = stream.sum();

        System.out.printf("sum = %d\n", sum);
        System.out.println();

    }

    //배열로 스트림 생성
    public void method2(){
        String[] names = {"홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향"};

//        Stream<String> stream = Arrays.<String>stream(names);
        Stream<String> stream = Arrays.stream(names);
//        stream.forEach(str -> System.out.print(str + " "));

        //for문보다 스트림 사용하면 중복 제거가 쉽다. (.distinct())
//        stream.distinct().forEach(str -> System.out.print(str + " "));

        //병렬로 처리. 데이터가 많으면 훨씬 빠르게 처리가 가능하다
        stream.parallel().forEach(str -> System.out.print(str + " "));
        System.out.println();
    }
}
