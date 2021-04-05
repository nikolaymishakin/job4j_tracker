package ru.job4j.oop;

public class Programmer extends Engineer {
    private String write;
    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Algoritm createalgorithm(Algoritm algoritm) {
        return new Algoritm();
    }
}
