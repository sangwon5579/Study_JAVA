package com.beyond.streamapi.practice;
/*
    수집
        - 최종처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 리턴 받을 수 있다.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class G_Collect {
    public void method1(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 35,'남',80, 50),
                new Student("김철수", 20,'남',50, 50),
                new Student("김영희", 21,'여',90, 90),
                new Student("성춘향", 21,'여',80, 90),
                new Student("이몽룡", 23,'남',80, 80)
        );

        //학생들의 이름만 List 컬렉션으로 추출
        List<String> names = students.stream()
//                .map(student -> student.getName())
                .map(Student::getName)
//                .collect(Collectors.toList());
                .toList();
        System.out.println(names);
        System.out.println();

        //남학생들만 list 컬렉션으로 추출
        List<String> list = students.stream()
                .filter(student -> student.getGender() == '남')
                .map(student -> student.getName())
                .toList();
        System.out.println(list);
        System.out.println();

        //여학생들만 set 컬렉션으로 추출
        Set<String> set = students.stream()
                .filter(student -> student.getGender() == '여')
                .map(student -> student.getName())
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println();

        //Map 컬렉션으로 추출 ( key : 이름, value : Student 객체)
        Map<String, Student> map = students.stream()
                .collect(Collectors.toMap(student -> student.getName(), Function.identity()));
        map.forEach((key, value) -> System.out.println(key + ":" + value));
        System.out.println();

        //Map 컬렉션으로 추출 (key : 성별, value : List<Student> 객체)
        Map<Character, List<Student>> listMap = students.stream()
                .collect(Collectors.groupingBy((Student student) -> {
                    return student.getGender();
                }));
        listMap.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(System.out::println);
            System.out.println();
        });

    }
}
