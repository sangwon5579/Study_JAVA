package com.beyond.api.practice;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
    Date 클래스
        - 날짜와 시간을 표현하는 클래스이다
        - 주로 객체 간에 날짜와 시간 정보를 주고 받을 때 사용한다.

   java.time 패키지
        - 자바 1.8부터 날짜와 시간을 나타내는 java.time 패키지를 제공한다
    - LocalDateTime
        - 날짜와 시간 정보를 모두 저장할 수 있는 객체를 생성하는 클래스
    - LocalDate
        - 날짜 정보를 저장할 수 있는 객체를 생성하는 클래스
    - LocalTime
        - 시간 정보를 저장할 수 있는 객체를 생성하는 클래스
 */
public class C_DateTime {
    public void method1(){
        // 1. Date 객체 생성
        //현재 시스템의 날짜와 시간에 대한 정보를 가지고 객체를 생성한다
        Date today = new Date();
        System.out.println(today);  //Mon Jul 21 14:38:23 KST 2025

        // 1970년 1월 1일 00시를 기준으로 밀리세컨드 단위로 표기된다
//        Date when = new Date(1000);
//        System.out.println(when);   //Thu Jan 01 09:00:01 KST 1970

        //Date when = new Date((2025-1900),(7-1),21);
        //System.out.println(when);   //Mon Jul 21 00:00:00 KST 2025

        //2. 날짜와 시간 정보 출력
        System.out.println(today.getTime());    //1753076894965
        System.out.println(today.getYear());    //125
        System.out.println(today.getMonth());   //6
        System.out.println(today.getDate());    //21
        System.out.println(today.getHours());   //15
        System.out.println(today.getMinutes()); //4
        System.out.println(today.getSeconds()); //1

        // 3. SimpleDateFormat 클래스 사용
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yy년-MM월-dd일(E) a HH시 mm분 ss초");
        System.out.println(sdf.format(today));  //2025-07-21(월) 15:09:03

    }

    public void method2(){
        //1. LocalDateTime 객체 생성
        //현재 시스템의 날짜와 시간 정보를 가지고 객체를 생성한다
        LocalDateTime now = LocalDateTime.now();
        //매개값으로 주어진 날짜와 시간 정보를 저장한 객체를 생성한다
        LocalDateTime when = LocalDateTime.of(2025, 7, 21, 15, 27, 30);

        System.out.println(now);    //2025-07-21T15:22:48.840185600
        System.out.println(when);   //2025-07-21T15:27:30
        System.out.println(ZonedDateTime.now());    //2025-07-21T15:29:14.627349100+09:00[Asia/Seoul]

        //2. 날짜와 시간 정보 출력
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println();

        // 3. 날짜와 시간을 조작하는 메소드
        LocalDateTime plusDays = now.plusDays(1).plusMonths(1);
        LocalDateTime minusDays = now.minusDays(1).plusMonths(1);
        System.out.println(minusDays); //2025-08-20T15:42:43.493523100
        System.out.println(plusDays); //2025-08-22T15:40:10.683571900
        System.out.println(now);       //2025-07-21T15:43:14.297323600

        // 4. 날짜와 시간을 비교하는 메소드
        System.out.println(now.isAfter(plusDays));  //false
        System.out.println(now.isBefore(plusDays)); //true
        System.out.println(now.isEqual(plusDays));  //false

        // 5. LocalDate 객체 생성
        //날짜 정보를 저장하는 객체를 생성한다
//        LocalDate localDate = LocalDate.now();
//        LocalDate localDate = LocalDate.of(2025, 7, 20);
//        LocalDate localDate = LocalDate.parse("2025-05-25");
        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);
        System.out.println();

        // 6. LocalTime 객체 생성
        // 시간 정보를 저장하는 객체를 생성한다
        LocalTime time = LocalTime.now();
        System.out.println(time);   //16:14:04.152012600

        // 7. DateTimeFormatter 클래스
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now);    //2025-07-21T16:22:26.965280300
        System.out.println(now.format(formatter));  //2025-07-21 16:22:26
        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));   //20250721
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));   //2025-07-21
        System.out.println(LocalDate.parse("2025-w20-2", DateTimeFormatter.ISO_WEEK_DATE)); //2025-05-13
    }
}
