package com.beyond.abstractclass.practice;

public class FootBall {
    // 참여하는 사람의 수
    private int numberOfPlayers;

    public FootBall(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void rule(){
        System.out.printf("FootBall의 선수는 %d명, 손이 아닌 발로 공ㅇㄹ 차야한다 \n", this.numberOfPlayers);
    }
}
