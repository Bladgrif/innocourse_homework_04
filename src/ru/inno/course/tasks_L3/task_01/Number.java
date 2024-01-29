package ru.inno.course.tasks_L3.task_01;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Number number = new Number();
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();
        number.checkingForDividedByTen(balance);
    }

    public void checkingForDividedByTen(int variable) {
        if (variable == 10) {
            System.out.println("Десятка");
        } else {
            System.out.println("Введенное вами число не равно 10");
        }
    }
}
