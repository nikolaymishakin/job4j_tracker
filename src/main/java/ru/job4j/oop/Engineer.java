package ru.job4j.oop;

public class Engineer extends Profession {
    private String project;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Drawing build(Building building) {
        return new Drawing();
    }
}
