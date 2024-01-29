package ru.inno.course.tasks_L5.task_01;

public class Card {
    private String id;
    private int expirationDate;
    private int cvv;
    private int pin;

    public Card(String id, int expirationDate, int cvv, int pin) {
        this.id = id;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.pin = pin;
    }

    public void printId() {
        System.out.println("**** **** **** " + id.substring(id.length() - 4));
    }

    public void checkingPin(int pin) {
        if (pin == this.pin) {
            System.out.println(this.id);
        } else {
            System.out.println("Pin is incorrect");
        }
    }
}
