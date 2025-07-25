package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/*
    정렬
        - 스트림의 요소들이 최종 처리가 되기 전에 중간 단계에서 요소들을 정렬할 수 있다.
        - IntStream, LongStream, DoubleStream 은 요소를 오름차순으로 정렬한다.
        - Stream<T>은 요소 객체가 Comparable 인터페이스를 구현해야 정렬할 수 있다
 */
public class C_Sort {
    //요소가 기본 자료형일 때
    public void method1(){
        //오름차순 정렬
        IntStream.of(3,5,1,4,2).boxed().sorted(Comparator.reverseOrder()).forEach(number -> System.out.println(number + " "));
    }

    //요소가 객체일때
    public void method2(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 35,'남',80, 50),
                new Student("김철수", 21,'남',50, 50),
                new Student("김영희", 20,'여',90, 90),
                new Student("홍길동", 35,'남',80, 50),
                new Student("이몽룡", 26,'남',80, 80)
        );

        //오름차순 정렬
//        students.stream().distinct().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
        System.out.println();
        students.stream().distinct().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);

    }
}
