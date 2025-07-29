package com.beyond.inherit.practice;

public class Circle extends Point {
    private int radius;

    public Circle(){}

    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    public void draw(){
        System.out.println("====Circle====");
        super.draw();
        System.out.printf("면적 : %.1f \n", (Math.PI * (double)(radius * radius)));
        System.out.printf("둘레 : %.1f \n", (double)(Math.PI * 2 * radius));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
