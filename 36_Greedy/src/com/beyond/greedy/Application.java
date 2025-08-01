package com.beyond.greedy;

import com.beyond.greedy.practice.GreedyExample;

public class Application {
    public static void main(String[] args) {
        //거스름도 문제
        //  - 가장 적은 수의 동전으로 거스름돈을 주는 문제
        int amount = 1870;
        int[] coins = {100, 10, 50, 500};

        System.out.printf("전체 필요한 동전의 개수 : %d\n", GreedyExample.minCoins(amount, coins));
        System.out.println();

        //활동 선택 문제
        //  - 최대한 많은 활동을 선택할 수 있는 활동의 최대 개수를 구하는 문제
        //(시작시간, 종료시간)
        int[][] activities = {
                {0, 6},
                {3, 5},
                {1, 4},
                {5, 9},
                {5, 7},
                {12, 16},
                {3, 9},
                {8, 12},
                {6, 10},
                {8, 11}
        };

        System.out.printf("최대 활동 수 : %d\n", GreedyExample.maxActivities(activities));
        System.out.println();
    }
}
