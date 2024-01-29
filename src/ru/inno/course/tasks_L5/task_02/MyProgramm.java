package ru.inno.course.tasks_L5.task_02;

public class MyProgramm {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "black", 2012);
        System.out.println(bmw.currentSpeed);
        bmw.speedUp(25);
        System.out.println(bmw.currentSpeed);
        bmw.breakSpeed();
        System.out.println(bmw.currentSpeed);
        bmw.breakSpeed();
        System.out.println(bmw.currentSpeed);
        bmw.breakSpeed();
        System.out.println(bmw.currentSpeed);
    }

}
