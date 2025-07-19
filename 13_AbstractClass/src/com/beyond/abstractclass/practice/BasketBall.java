package com.beyond.abstractclass.practice;

public class BasketBall extends Sports{
   public BasketBall(int numberOfPlayers) {
       super(numberOfPlayers);
    }

    @Override
    public void rule(){
       System.out.printf("BasketBall의 선수는 %d명, 공을 던저서 링에 넣어야 한다 \n", this.numberOfPlayers);
    }
}
