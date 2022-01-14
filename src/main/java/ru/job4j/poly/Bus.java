package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void drive() {
        System.out.println("Едет");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Принято на борт " + count + " пассажиров");
    }

    @Override
    public double fillUp(int count) {
        return 1.5 * count;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам");
    }

    @Override
    public void characteristic() {
        System.out.println(getClass().getSimpleName() + " заправляется бензином");
    }
}
