package com.beyond.control.practice;

public class E_Branch {
    public void method1(){
        for(;;){
            int sum = 0;
            int random = (int) (Math.random()*10+1);
            if(random == 5){
                System.out.println("랜덤값이 5이므로 종료");
                break;
            }
            for(int i = 0; i<= random;i++){
                sum += i;
            }
            System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);


        }
    }
    public void method2(){
        for(int i = 2; i <= 9; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.printf("<<%d단>>\n", i);
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
            System.out.println();
        }
    }
}
