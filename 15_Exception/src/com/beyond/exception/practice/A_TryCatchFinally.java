package com.beyond.exception.practice;

public class A_TryCatchFinally {
    public void method1(){
        try{
            //예외가 발생할 수 있는 코드 작성
            int result = 10 / 2;

            throw new ClassCastException();
//            throw new NullPointerException();
//            System.out.println(result);
        } catch (ArithmeticException e){
            //try에서 발생한 예외를 처리하는 코드 작성
            System.out.printf("Arithmetic Exception(%s)이 발생\n", e.getMessage());
        } catch(NullPointerException | ClassCastException e) {
            System.out.println("nullpointer exception or ClassCastException 발생");
        } catch (Exception e){
            System.out.println("에러 발생");
        } finally {
            // 예외 발생 여부 상관없이 무조건 실행
            System.out.println("finnaly 블록 실행");
        }

    }
}
