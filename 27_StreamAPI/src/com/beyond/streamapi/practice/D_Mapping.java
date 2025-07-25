package com.beyond.streamapi.practice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    매핑
        - 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 역할을 한다.
 */
public class D_Mapping {
    public void method1(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 35,'남',80, 50),
                new Student("김철수", 21,'남',50, 50),
                new Student("김영희", 20,'여',90, 90),
                new Student("홍길동", 35,'남',80, 50),
                new Student("이몽룡", 26,'남',80, 80)
        );

        //학생들의 이름 출력
        students.stream().distinct().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).map(Student::getName).forEach(System.out::println);
        System.out.println();

        //학생들의 수학 점수의 합계
        int sum = students.stream().distinct().mapToInt(Student::getMath).sum();
        System.out.println(sum);
    }

    public void method2(){
        int[] iNumber = {1, 2, 3, 4, 5};
        double[] dNumber = {1.1, 2.2, 3.3, 4.4, 5.5};

        //int -> long -> double 변환 가능
        Arrays.stream(iNumber).asDoubleStream().forEach(System.out::println);
        System.out.println();

        //중간 처리 메소드는 최종 처리 메소드가 호출되어야 동작한다
        double sum = Arrays.stream(dNumber)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .mapToDouble(Double::doubleValue)
                    .peek(System.out::println)
                    .sum();

        System.out.println(sum);

    }
}
