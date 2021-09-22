package ru.job4j.poly;

public class Polytransport {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{bus, plane, train};
        for (Vehicle a: vehicles) {
            a.move();
            a.characteristic();
        }
        }
    }
