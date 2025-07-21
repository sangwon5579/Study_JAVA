package com.beyond.api;
/*
    기본 API (Application Programming Interface)
        - API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다
        - 자바에서 말하는 API는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모듈을 말한다
 */


import com.beyond.api.practice.A_String;
import com.beyond.api.practice.B_Wrapper;
import com.beyond.api.practice.C_DateTime;

public class Application {
    public static void main(String[] args) {
        //문자열과 관련된 클래스
        //new A_String().method1();
        //new A_String().method2();
        //new A_String().method3();

        //Wrapper 클래스
        //new B_Wrapper().method1();
        //new B_Wrapper().method2();

        //날짜와 시간과 관련된 클래스
        //new C_DateTime().method1();
        new C_DateTime().method2();
    }
}
