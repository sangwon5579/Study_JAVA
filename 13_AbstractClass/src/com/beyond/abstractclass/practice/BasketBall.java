package com.beyond.abstractclass.practice;

public class BasketBall {
    private int numberOfPlayers;

    public BasketBall(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void rule(){
        System.out.printf("BasketBall의 선수는 %d명, 공을 던저서 링에 넣어야 한다 \n", this.numberOfPlayers);
    }
}
