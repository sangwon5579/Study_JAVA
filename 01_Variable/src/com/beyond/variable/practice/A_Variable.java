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
        char ch;            //2byte의 문자(유니코드)를 담을 수 있는 변수를 선언한다.

        //지역 변수를 선언 후 초기화가 되지 않은 경우 에러 발생
        //System.out.println(isTrue);

        isTrue = true;
        //isTrue = 1; -> 에러
        System.out.println(isTrue);

    }
}
