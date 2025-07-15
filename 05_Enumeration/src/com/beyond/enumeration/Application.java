package com.beyond.enumeration;

import com.beyond.enumeration.practice.Week;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Week today = Week.TUESDAY; //다양한 메소드들 사용 가능해짐. today.~~
       
        //열거 상수에서 제공하는 메소드
        System.out.println(today.name());
        System.out.println(today.ordinal()); //몇번째 열거 상수인지 정숫값 반환(0부터 시작)
        System.out.println(today.equals(Week.MONDAY));
        System.out.println(today.compareTo(Week.MONDAY)); //1
        System.out.println(today.compareTo(Week.WEDNESDAY)); //-1

        //열거 타입에서 기본적으로 제공하는 정적 메소드
        System.out.println();
        Week friday = Week.valueOf("FRIDAY");
        System.out.println(friday);
        System.out.println();

        Week[] weeks = Week.values();
        System.out.println(Arrays.toString(weeks));
        System.out.println();

        //열거타입에 속성 추가 후 실행
        System.out.println(today.getName());
        System.out.println(today.getShortName());
        System.out.println(today.getValue());
        System.out.println();

        System.out.println(friday.getName());
        System.out.println(friday.getShortName());
        System.out.println(friday.getValue());
        System.out.println();

    }
}
