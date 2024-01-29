package ru.inno.course.tasks.task_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Verification {

    public static void main(String[] args) {
        Verification verification = new Verification();
        Random random = new Random();
        List<String> address = new ArrayList<>();
        address.add("http://vk.com");
        address.add("https://secure-address.com");
        address.add("http://netban.com");
        verification.checkingForASecureAddress(address.get(random.nextInt(address.size())));
    }

    public void checkingForASecureAddress(String variable) {
        System.out.println(variable);
        if (variable.startsWith("https://")) {
            System.out.println("Соединение безопасное");
        } else {
            System.out.println("Небезопано. Не указывайте логины, пароли и данные банковских карт");
        }

    }
}
