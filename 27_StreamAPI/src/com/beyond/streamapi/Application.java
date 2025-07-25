package com.beyond.streamapi;

import com.beyond.streamapi.practice.*;

public class Application {
    public static void main(String[] args) {
        //스트림 생성
//        new A_Stream().method1();
//        new A_Stream().method2();
//        new A_Stream().method3();

        //중간 처리 메소드
//        new B_Filtering().method1();
//        new B_Filtering().method2();
//        new C_Sort().method1();
//        new C_Sort().method2();
//        new D_Mapping().method1();
//        new D_Mapping().method2();

        //최종 처리 메소드
//        new E_Match().method1();
//        new E_Match().method2();
     new F_Aggregate().method1();
    }
}
