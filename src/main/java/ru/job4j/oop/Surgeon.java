package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String analysis;
    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Cutting bodypart(Part part) {
        return new Cutting();
    }
}
