package ru.inno.course.tasks.task_03;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Number number = new Number();
        Scanner scanner = new Scanner(System.in);
        int variable = scanner.nextInt();
        number.checkingForParityOfNumberV2(variable);

    }

    public void checkingForParityOfNumberV2(int variable) {
        if (variable % 2 == 0 & variable % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        } else if (variable % 2 == 0) {
            System.out.println("Четное число.");
        } else if (variable % 3 == 0) {
            System.out.println("Нечетное число. Кратно трем.");
        } else {
            System.out.println("Нечетное число.");
        }
    }
}
