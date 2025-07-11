package com.beyond.operator;

import com.beyond.operator.practice.A_logicalNegation;
import com.beyond.operator.practice.B_inDecrease;
import com.beyond.operator.practice.C_Arithmetic;

public class Application {
    public static void main(String[] args) {
        A_logicalNegation a = new A_logicalNegation();
        a.method1();
        System.out.println("++++++++++++");
        B_inDecrease b = new B_inDecrease();
        b.method1();
        System.out.println("+++++++++++++");
        b.method2();
        System.out.println("+++++++++++++");
        new C_Arithmetic().method1();
    }
}
