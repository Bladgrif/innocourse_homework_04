package ru.inno.course.tasks_L5.task_02;

public class Car {
    String model;
    String color;
    int year;
    int currentSpeed;

    public Car(String model, String color, int year, int currentSpeed) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.currentSpeed = currentSpeed;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.currentSpeed = 0;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int speedUp(int speed) {
        currentSpeed += speed;
        return currentSpeed;
    }

    public void breakSpeed() {
        if (this.currentSpeed <= 10) {
            this.currentSpeed = 0;
        } else {
            this.currentSpeed = currentSpeed - 10;
        }

    }
}
