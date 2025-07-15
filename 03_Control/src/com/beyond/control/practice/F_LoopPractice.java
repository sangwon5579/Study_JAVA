package com.beyond.control.practice;

import java.util.Scanner;

public class F_LoopPractice {
    public void practice1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 > ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum += i;
        }
        System.out.printf("1부터 %d까지 합 : %d\n", n, sum);
        System.out.println();
    }
    public void practice2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단을 출력할 단수 입력 > ");
        int n = scanner.nextInt();
        for(int i = 1; i<=9; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        System.out.println();
    }
    public void practice3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 > ");
        String word = scanner.nextLine();
        for(int i  = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
        System.out.println();
    }
    public void practice4(){
        for(int i = 0; i<4; i++){
            System.out.print('*');
            for(int j = 1; j<=4; j++){
                System.out.print(j);
                for (int k = 3; k>=0;k--){
                    System.out.print('*');
                }
            }System.out.println();
        }
        System.out.println();
    }
    public void practice5(){
        String str = "*";
        for(int i = 1; i<=5;i++){
            System.out.println(str);
            str += '*';

        }
    }
    public void practice6(){
        int num1;
        int num2;
        char operator ='\u0000';
        while(true){
            int sum = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("첫번째 수 > ");
            num1 = scanner.nextInt();
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("두번째 수 > ");
            num2 = scanner1.nextInt();
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("연산자 입력(+, -, *, /) > ");
            operator = scanner1.next().charAt(0);
            if(operator == '+'){
                sum = num1 + num2;
                System.out.printf("%d + %d = %d\n", num1, num2, sum);
            }
            else if(operator == '-'){
                sum = num1 - num2;
                System.out.printf("%d - %d = %d\n", num1, num2, sum);
            }
            else if(operator == '*'){
                sum = num1 * num2;
                System.out.printf("%d * %d = %d\n", num1, num2, sum);
            }
            else if(operator == '/'){
                sum = num1 / num2;
                System.out.printf("%d / %d = %d\n", num1, num2, sum);
            }
            else{
                System.out.println("연산자를 잘못 입력하셨습니다.");
                break;
            }
            System.out.println();

        }
    }
}
