package ru.inno.course.tasks_L3.task_02;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Number number = new Number();
        Scanner scanner = new Scanner(System.in);
        int variable = scanner.nextInt();
        number.checkingForParityOfNumber(variable);
    }

    public void checkingForParityOfNumber(int variable) {
        if (variable % 2 == 0) {
            System.out.println("Четное число.");
        } else {
            System.out.println("Нечетное число.");
        }
    }
}
