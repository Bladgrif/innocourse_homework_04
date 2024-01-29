package ru.inno.course.tasks_L5.task_01;

public class MyProgram {
    public static void main(String[] args) {
        Card card = new Card("1234 4567 7890 3210", 2305, "323", "1234");
        card.printId();
        card.checkingPin("5467");
        card.checkingPin("1234");

//        System.out.println(card.id);
    }
}
