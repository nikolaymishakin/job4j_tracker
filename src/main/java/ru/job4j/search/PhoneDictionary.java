package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person persons : persons) {
            if (persons.getName().contains(key)) {
                result.add(persons);
            }
            if (persons.getSurname().contains(key)) {
                result.add(persons);
            }
            if (persons.getAddress().contains(key)) {
                result.add(persons);
            }
            if (persons.getPhone().contains(key)) {
                result.add(persons);
            }
        }
        return result;
    }
}
