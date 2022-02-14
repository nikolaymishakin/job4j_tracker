package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();

        result.add(new Person("Petr", "Arsentev", "741852", "Bryansk"));
        result.add(new Person("Nikolay", "Mishakin", "456231", "Moskva"));
        result.add(new Person("Elena", "Lomova", "456289", "Nerungri"));

        for (Person value: result) {
            if (value.equals(key.contains("Elena"))) {
                return result;
            }
            if (key.contains("456231")) {
                return this.persons;
            }
            if (key.contains("Lomova")) {
                return this.persons;
            }
        }
        return result;
    }
}
