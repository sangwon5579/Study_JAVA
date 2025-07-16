package com.beyond.field.practice;

public class User {
    //필드 선언
    public String id = "hong123";
    protected String address;
    String name = "홍길동";
    private String password;
    // <- 클래스 내에 선언 : 필드 -클래스로 만들어지는 객체들이 고유하게 가질 수 있는 속성을 정의

    //메소드 선언
    //매개변수도 지역변수로 메소드 영역에서 사용이 가능하다
    public void test(int value){
        int num; //지역변수 - 메소드 안에서 필요한 작업을 하기위해 만들어진 변수, 접근 제한자 사용 불가
        //지역 변수는 사용하기 전에 반드시 초기화 해야한다.
        num = 20;
        System.out.println(num);
        System.out.println(password); // 필드는 클래스 전역에서 사용 가능. 미초기화 시에는 JVM이 기본값으로 초기화한다
        //정수형 ; 0, 실수형 : 0.0, 문자형 : '\u0000', 논리형 : false, 참조형 : null
        System.out.println(value);

    }
}
