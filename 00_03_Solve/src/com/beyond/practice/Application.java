package com.beyond.practice;

import com.beyond.practice.model.vo.Animal;
import com.beyond.practice.model.vo.Cat;
import com.beyond.practice.model.vo.Dog;

public class Application {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("개이름1", "개종류1", 10);
        animals[1] = new Cat("고양이이름1", "고양이종류1", "위치1", "검정");
        animals[2] = new Cat("고양이이름2", "고양이종류2", "위치2", "파랑");
        animals[3] = new Dog("개이름2", "개종류2", 20);
        animals[4] = new Dog("개이름3", "개종류3", 30);

        for(int i = 0; i < animals.length; i++){
            animals[i].speak();
        }

    }
}
