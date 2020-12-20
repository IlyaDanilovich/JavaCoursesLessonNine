package com.company;

public class Car {
    public int speed;
    public String color;
    public Car (Car obj){
        this.speed = obj.speed;
        this.color = obj.color;
    }

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public Car() {

    }

    public void show(){
        System.out.println("speed=" + speed + ",color" + color);
    }

    public double time(double length) {
        return length / speed;
    }
}
