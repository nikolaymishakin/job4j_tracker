package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам");
    }

    @Override
    public void characteristic() {
        System.out.println(getClass().getSimpleName() + " заправляется электричеством");
}
}
