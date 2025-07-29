package com.beyond.inherit;

import com.beyond.inherit.practice.Circle;
import com.beyond.inherit.practice.Rectangle;

public class Application {
    public static void main(String[] args) {
        Circle[] circle = new Circle[2];
        circle[0] = new Circle(1, 2, 3);
        circle[1] = new Circle(3, 3, 4);

        Rectangle[] rectangle = new Rectangle[2];
        rectangle[0] = new Rectangle(-1, -2, 5, 2);
        rectangle[1] = new Rectangle(-2, 5, 2, 8);

        for (Circle value : circle) {
            value.draw();
        }

        for (Rectangle value1 : rectangle){
            value1.draw();
        }
    }
}
