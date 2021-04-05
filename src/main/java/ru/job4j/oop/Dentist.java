package ru.job4j.oop;

public class Dentist extends Doctor {
    private String filing;

    public Dentist(String name, String surname, String education, String birthday, String filing) {
        super(name, surname, education, birthday);
        this.filing = filing;
    }

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Tooth pullout(Tooth tooth) {
        return new Tooth();
    }
}
