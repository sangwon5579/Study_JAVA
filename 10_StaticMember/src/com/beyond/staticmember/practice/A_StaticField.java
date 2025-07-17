package com.beyond.staticmember.practice;

public class A_StaticField {
    //정적필드
    //정적필드는 프로그램이 실행될 때 해당 클래스가 생성되고, 프로그램이 종료될때 소멸된다
    public static int number = 2;

    private static String message = "Hello";

    //정적 필드에 대한  getter와 setter 메소드도 static 키워드가 붙어야한다
    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        A_StaticField.message = message;
    }
}
