package com.beyond.variable.practice;

public class A_Variable {
    /*
    변수의 선언
        [표현법]
            자료형 변수명;

     변수의 초기화
        [표현법]
            변수명 = 값;
     */
    public void variableTest(){
        //논리형
        boolean isTrue;     //1byte의 논리값을 담을 수 있는 변수를 선언한다.

        //정수형
        byte bNum;          //1byte의 정수를 담을 수 있는 변수를 선언한다.
        short sNum;         //2byte의 정수를 담을 수 있는 변수를 선언한다.
        int iNum;           //4byte의 정수를 담을 수 있는 변수를 선언한다.
        long lNum;          //8byte의 정수를 담을 수 있는 변수를 선언한다.

        //실수형
        float fNum;         //4byte의 실수를 담을 수 있는 변수를 선언한다.
        double dNum;        //8byte의 실수를 담을 수 있는 변수를 선언한다.

        //문자형
        char ch = 'A';      //2byte의 문자(유니코드)를 담을 수 있는 변수를 선언한다.
                            //문자 하나만 넣을 수 있음. A, a, 가, @
        System.out.println(ch);

        char ch2  = 97;
        System.out.println(ch2); //a 출력. 코드값 주는 것도 가능. 음수값은 불가능. 0~65535(유니코드)
        char ch3 = 65535;
        System.out.println(ch3); //유니코드는 전세계 모든 언어에 대한 코드값.

        ///char ch4 = ''; //error. 빈문자열 불가능.
        char ch4 = 0; //빈문자열
        System.out.println(ch4);

        char ch5 = '\u0000';
        System.out.println(ch5); //빈문자열
        System.out.println();

        //문자열
        //String name = '홍길동'; //error
        String name = "홍길동";
        String name2 = ""; //빈문자열 가능
        System.out.println(name);
        System.out.println(name2);
        System.out.println();

        //지역 변수를 선언 후 초기화가 되지 않은 경우 에러 발생
        //System.out.println(isTrue);

        isTrue = false;
        //isTrue = 1; -> 에러
        System.out.println(isTrue);
        System.out.println();

        bNum = 127;
        System.out.println(bNum);

        sNum = 32767;
        System.out.println(sNum);

        iNum = 2147483647;
        System.out.println(iNum);

        //long 타입의 리터럴은 숫자 뒤에 L을 입력.
        //lNum = 9223372036854775807;
        lNum = 9223372036854775807L;
        System.out.println(lNum);
        System.out.println();

        //float 타입의 리터럴은 숫자 뒤에 F or f를 입력.
        fNum = 3.141592F;
        System.out.println(fNum);

        //double 타입의 리터럴은 숫자 뒤에 D or d를 입력해도 되지만 생략 가능. 기본이 double이니깐.
        dNum = 3.141592;
        System.out.println(dNum);
        System.out.println();
        System.out.println();
    }
}
