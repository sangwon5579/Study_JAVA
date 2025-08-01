package com.beyond.dynamic.practice;
/*
    피보나치수열
        - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 */

import java.util.HashMap;
import java.util.Map;

public class DynamicExample {
//    public static int fibonacci(int n){
//        if (n <= 1){
//            return n;
//        }
//        int[] values = new int[n + 1];
//        values[0] = 0;
//        values[1] = 1;
//        for (int i = 2; i < values.length; i++){
//            values[i] = values[i-1] + values[i-2];
//        }
//        return values[n];
//    }

//    public static long fibonacci(long n){
//        if(n<=1){
//            return n;
//        }else{
//            return fibonacci(n-1)+fibonacci(n-2);
//        }
//    }

    //계산된 피보나치 수열의 항을 저장하는 맵이다
    //  - 키는 피보나치 수열의 항
    //  - 값은 해당 항의 피보나치 수
    private static final Map<Long, Long> memo = new HashMap<>();

    public static long fibonacci(long n){
        if(n<=1){
            return n;
        }else if(memo.containsKey(n)){
            return memo.get(n);
        }else{
            long result = fibonacci(n-1) + fibonacci(n-2);
            memo.put(n,result);
            return result;
        }
    }
}
