package ru.inno.course.tasks_L5.task_01;

public class Card {
    private String id;
    private int expirationDate;
    private String cvv;
    private String pin;

    public Card(String id, int expirationDate, String cvv, String pin) {
        this.id = id;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.pin = pin;
    }

    public void printId() {
        System.out.println("**** **** **** " + id.substring(id.length() - 4));
    }

    public void checkingPin(String pin) {
        if (pin == this.pin) {
            System.out.println(this.id);
        } else {
            System.out.println("Pin is incorrect");
        }
    }
}
