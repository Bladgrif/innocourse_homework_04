package ru.inno.course.tasks.task_05;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Password password = new Password();
        Scanner scanner = new Scanner(System.in);
        String passwordInput = scanner.nextLine();
//        System.out.println(passwordInput.matches(".{8,}"));
        password.verification(passwordInput);

    }

    public void verification(String variable) {
        int count = 0;
        if (!variable.matches(".{8,}")) {
            System.out.println("Пароль не менее 8 символов");
            count++;
        }
        if (!variable.matches(".*\\d.*")) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
            count++;
        }
        if (!variable.matches(".*[!@#$%^&*№].*")) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
            count++;
        }
        if (count == 0) {
            System.out.println("пароль принят");
        } else {
            System.out.println("пароль не принят");
        }
    }
}
