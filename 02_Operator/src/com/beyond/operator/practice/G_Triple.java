package com.beyond.operator.practice;

import java.util.Scanner;

public class G_Triple {
    public void methold1(){
        //user에게 입력받은 정수가 양수인지 음수인지 판단하기
        int number = 0;
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("임의의 정수 입력 > ");
        number = scanner.nextInt();

        //result = (number > 0) ? "양수" : "음수";
        result = (number > 0) ? "양수" : ((number == 0) ? "0" : "음수");
        System.out.println(result);

    }
}
