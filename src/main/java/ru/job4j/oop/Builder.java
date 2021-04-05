package ru.job4j.oop;

public class Builder extends Engineer {
    private int count;

    public Builder(String name, String surname, String education, String birthday, int count) {
        super(name, surname, education, birthday);
        this.count = count;
    }

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Building buildbuilding (Building building) {
        return new Building();
    }
}
