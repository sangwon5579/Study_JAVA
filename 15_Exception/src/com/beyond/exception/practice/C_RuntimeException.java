package com.beyond.exception.practice;

import java.util.Scanner;

public class C_RuntimeException {
    public void method1(){
        //ArrayIndexOutOfBoundsException, NegativeArraySizeException
        int size = 0;
        int[] numbers = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 길이 >");

        size = sc.nextInt();
        if(size <= 0){
            System.out.println("0보다 큰 값을 입력해주세요");
            return;
        }
        numbers = new int[size];

        for(int i = 0; i < size;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
