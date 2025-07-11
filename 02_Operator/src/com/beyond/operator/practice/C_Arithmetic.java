package com.beyond.operator.practice;

public class C_Arithmetic {
    public void method1(){
        int number1 = 10;
        int number2 = 3;

        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1%number2);
        System.out.println();

        double number3 =10.0;
        double number4 = 3.0;
        System.out.println(number3+number4);
        System.out.println(number3-number4);
        System.out.println(number3*number4);
        System.out.println(number3/number4);
        System.out.println(number3%number4);
        System.out.println();

        char ch = '홍';
        System.out.println(ch+1);
        System.out.println((char)(ch+1));
        System.out.println('a'+'b');
        System.out.println();

        System.out.println(5.0 / 0);    //Infinity
        System.out.println(5.0 % 0);    //NaN (NOt A Number)
        System.out.println(Double.isInfinite(5.0/0));   //연산 결과가 Infinity 인지 검사
        System.out.println(Double.isNaN(5.0%0));        //연산 결과가 NaN인지 검사
    }
}
