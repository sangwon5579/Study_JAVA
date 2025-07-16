package com.beyond.method.practice;

public class A_Method {
    // 1. 매개변수와 반환값이 없는 메소드
    public void method1(){
        System.out.println("매개변수 X 반환값 X");
        //return이 생략되어있음
        //return 문 뒤에 반환값이 오면  에러 발생. void니깐
        //return;은 생략 가능
    }
    
    // 2. 매개변수가 없고 반환값이 있는 메소드
    public String method2(){
        String str = "매개변수 X 반환값 O";
        return str; //문자열의 주소를 반환
    }

    // 3. 매개변수가 있고 반환값이 없는 메소드
    public void method3(int number1, int number2){
        System.out.printf("입력받은 매개변수의 합은 : %d\n", number1+number2);
    }
    
    // 4. 매게변수가 있고 반환값도 있는 메소드
    public int method4(int number1, int number2){
        return number1 * number2;
    }

    // 5. 매개변수로 객체를 전달받는 메소드
    public void method5(User  user){
        user.setId("lee123");
        user.setPassword("5555");
        user.setName("이몽룡");
    }

    // 6. 매개변수로 가변인자를 전달받는 메소드
    // 1) 배열 사용
    // public int method6(int[] numbers) {
    // 2) 가변 인자 사용
    public int method6(int... numbers) {
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

}
