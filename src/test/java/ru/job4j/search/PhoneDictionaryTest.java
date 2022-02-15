package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Nikolay", "Mishakin", "456231", "Moskva")
        );
        ArrayList<Person> persons = phones.find("Petr");
        ArrayList<Person> persons1 = phones.find("Nikolay");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
        assertThat(persons1.get(0).getSurname(), is("Mishakin"));
    }

}
