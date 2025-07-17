package com.beyond.staticmember;

import com.beyond.staticmember.practice.A_StaticField;
import com.beyond.staticmember.practice.B_StaticMethod;
import com.beyond.staticmember.practice.C_StaticFinalField;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {
        //정적 필드 테스트
        // 1. 정적 필드 생성 및 출력
        System.out.println(A_StaticField.number);
        System.out.println();

        // 2. 객체의 정적 필드 공유
        A_StaticField staticField1 = new A_StaticField();
        A_StaticField staticField2 = new A_StaticField();
        System.out.println(staticField1.number);
        System.out.println(staticField2.number);
        System.out.println();

        A_StaticField.number++;
        System.out.println(staticField1.number);
        System.out.println(staticField2.number);
        System.out.println();

        // 3. 정적 필드의 getter와 setter 매소드
        System.out.println(A_StaticField.getMessage());

        A_StaticField.setMessage("메시지변경");

        System.out.println(A_StaticField.getMessage());
        System.out.println();


        //정적 메소드 테스트
        // 1. 매개변수와 반환값이 없는 정적 메소드 호출
        B_StaticMethod.method1();
        B_StaticMethod.method1();
        System.out.println();

        //2. 매개변수가 없고 반환값이 있는 정적 메소드 호춣
        System.out.println(B_StaticMethod.method2());

        //3. 매개변수가 있고 반환값이 없는 정적 메소드 호출
        System.out.println(50);

        //4. 매개 변수가 있고 반환값도 있는 정적 메소드 호출
        System.out.println(B_StaticMethod.method4());
        System.out.println(B_StaticMethod.method4(4, 5, 10));
        System.out.println(B_StaticMethod.method4(4, 5, 10, 20, 30, 40));
        System.out.println();


        //final 필드 test
        C_StaticFinalField finalField1 = new C_StaticFinalField("남자");
        C_StaticFinalField finalField2 = new C_StaticFinalField("여자");

        System.out.println(finalField1.getGender());
        System.out.println(finalField2.getGender());
        System.out.println();

        //상수 테스트
        System.out.println(C_StaticFinalField.MAX_LEVEL);
        System.out.println(Math.PI);
        System.out.printf("byte의 표현 범위는 %d~%d\n", Byte.MAX_VALUE, Byte.MIN_VALUE);
        System.out.printf("int의 표현 범위는 %d~%d\n", Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.printf("float의 표현 범위는 %f~%f\n", Float.MAX_VALUE, Float.MIN_VALUE);
        System.out.println();
    }
}
