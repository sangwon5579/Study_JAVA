package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
        필터링
            - 필터링 중간 처리 기능으로 요소를 걸러내는 역할을 한다
            - distinct() 메소드는 요소의 중복을 제거하는 메소드이다
            - filtwer(Predicate) 메소드는 매개값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다.
*/
public class B_Filtering {
    //중복 제거 테스트
    public void method1(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 35,'남',80, 50),
                new Student("김철수", 20,'남',50, 50),
                new Student("김영희", 20,'여',90, 90),
                new Student("홍길동", 35,'남',80, 50),
                new Student("이몽룡", 26,'남',80, 80)
        );
//        Stream<Student> stream = students.stream();
//        stream.forEach(System.out::println);
//        System.out.println();
        //이미 최종 처리 메소드까지 호출된 스트림은 다시 사용할 수 없다
        //리스트로부터 스트림을 다시 얻어야 한다
//        stream.distinct().forEach(System.out::println);
        students.stream().distinct().forEach(System.out::println);
    }

    //필터 메소드 테스트
    public void method2(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 35,'남',80, 50),
                new Student("김철수", 20,'남',50, 50),
                new Student("김영희", 20,'여',90, 90),
                new Student("홍길동", 35,'남',80, 50),
                new Student("이몽룡", 26,'남',80, 80)
        );

        //성별이 여자인 학생만 출력
        students.stream().filter(student -> student.getGender() == '여').forEach(System.out::println);

        //수학, 영어점수가 모두 60점 이상인 학생만 출력
        students.stream().distinct().filter(student -> (student.getEnglish() >= 60 && student.getMath()>= 60)).forEach(System.out::println);
    }
}
