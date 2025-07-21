package com.beyond.api.practice;
        /*
        Wrapper 클래스
            - 기본 자료형을 객체로 포장해주는 클래스
            - 프로그램에 따라서 기본 타임을 객체로 취급해서 처리해야하는 경우에 사용한다
            - 기본 자료형을 Wrapper 클래스로 포장해주는 것을 Boxing 이라고 한ㄷ,
            - Wrapper 클래스를 기본 자료형으로 변경해 주는 것을 unBoxing이라고 한다.
         */
public class B_Wrapper {
    //Boxing Unboxing 테스트
    public void  method1(){
        // 1. Boxing(기본 타입 -> Wrapper 객체)
        // 1) Wrapper 클래스로 객체를 생성하는 방법(@Deprecated)
//        Integer integer = new Integer(10);
//        Double double1 = new Double(3.14);
//        Double double2 = new Double(3.14);

        //2) 정적 메소드를 통해서 생성하는 방법
//        Integer integer = Integer.valueOf(10);
//        Double double1 = Double.valueOf(3.14);
//        Double double2 = Double.valueOf("3.14");

        //3) Auto Boxing (1.5부터 지원)
        Integer integer = 10;
        Double double1 = 3.14;
        Double double2 = 3.14;

        System.out.println(integer);    //10
        System.out.println(double1);    //3.14
        System.out.println(double2);    //3.14
        //클래스에서 제공해주는 메소드들을 사용할 수 있다
        System.out.println(double1.equals(double2));    //true
        //두 값을 비교해서 double1이 크면 1 반환 double2가 크면 -1 반환, 같으면 0 반환
        System.out.println(double1.compareTo(double2)); //0
        System.out.println(double1 == double2);         //false (주소값비교)
        System.out.println();

        // 2. Unboxing (Wrapper 객체 -> 기본 타입)
        // 1) Wrapper 객체의 매소드를 이용하는 방법
//        int number = integer.intValue();
//        double dNumber1 = double1.doubleValue();
//        double dNumber2 = double2.doubleValue();

        // 2) Auto Unboxing
        int number = integer;
        double dNumber1 = double1;
        double dNumber2 = double2;

        System.out.println(number);                 //10
        System.out.println(dNumber1);               //3.14
        System.out.println(dNumber2);               //3.14
        System.out.println(dNumber1 == dNumber2);   //true
        System.out.println();
    }

    //String과 Wrapper 클래스간의 변경
    public void method2(){
        // 1. 문자열을 기본 자료형으로 변경 (Wrapper 클래스의 parseXXX() 메소드 사용)
        int iNumber = Integer.parseInt("10");
        //int iNumber = Integer.parseInt("10.3"); //에러 발생
        double dNumber = Double.parseDouble("3.14");
        //double dNumber = Double.parseDouble("10"); //가능. 에러 발생 X. 10.0

        System.out.println(iNumber);                //10
        System.out.println(dNumber);                //3.14
        System.out.println(dNumber == iNumber);     //false
        System.out.println();

        // 2. 기본 자료형을 문자열로 변경
        // 1) String 클래스의 valueOf() 메소드 사용
//        String str1 = String.valueOf(10);
//        String str2 = String.valueOf(3.14);

        // 2) Wrapper  클래스의 valueOf() 메소드 사용
//        String str1 = Integer.valueOf(10).toString();
//        String str2 = Double.valueOf(3.14).toString();
//
//        System.out.println(str1);           //10
//        System.out.println(str2);           //3.14
//        System.out.println(str1 + str2);    //103.14




    }
}
