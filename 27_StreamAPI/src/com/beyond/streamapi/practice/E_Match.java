package com.beyond.streamapi.practice;
/*
    매칭
        - 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 역할을 한다
        - allMatch(Predicate) 모든 요소들이 매개값으로 주어진 predicate의 조건을 만족하는지 조사한다.
        - anyMatch(Predicate) 최소한 1개의 요소가 매개값으로 주어진 predicate의 조건을 만족하는지 조사한다
        - nonMatch(Predicate) 모든 요소들이 매개값으로 주어진 predicate의 조건을 만족하지 않는지 조사한다
 */

import java.util.Arrays;
import java.util.List;

public class E_Match {
    public void method1(){
        boolean result;
        int[] numbers = {2, 4, 6};

        result = Arrays.stream(numbers).allMatch(number -> number % 2 == 0);
        System.out.println(result);
        //true

        result = Arrays.stream(numbers).anyMatch(number -> number % 3 == 0);
        System.out.println(result);
        //true

        result = Arrays.stream(numbers).noneMatch(number -> number % 5 == 0);
        System.out.println(result);
        //true

    }

    public void method2(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 35,'남',80, 50),
                new Student("김철수", 21,'남',50, 50),
                new Student("김영희", 20,'여',90, 90),
                new Student("홍길동", 35,'남',80, 50),
                new Student("이몽룡", 23,'남',80, 80)
        );

        //남학생들 중에 평균이 80점 이상인 학생이 한명이라도 존재하는지 확인하시오
        boolean result = students.stream().distinct().filter(student -> student.getGender() == '남').mapToDouble(student -> student.average()).anyMatch(average -> average >= 80);
        System.out.println(result);
        //나이가 20살 이상인 학생들이 모두 남자인지 확인하시오
        boolean result2 = students.stream().distinct().filter(student -> student.getAge() >= 20).allMatch(student -> student.getGender() == '남');
        System.out.println(result2);
    }
}
