package ru.inno.course.tasks_L3.task_06;

import java.util.Scanner;

public class Verification {
    public static void main(String[] args) {
        Verification verification = new Verification();
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        verification.checking(password);
    }

    public void checking(String password) {
        if (password.equals("Qwerty0987654321")) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
    }
}
