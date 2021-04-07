package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] items1 = new Item[items.length];
        for (int i = 0; i <items.length; i++) {
            Item item = items[i];
            if (item != null) {
                items1[size] = item;
                size++;
            }
        }
        items1 = Arrays.copyOf(items1, size);
        return items1;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] items1 = new Item[items.length];
        for (int i = 0; i <items.length; i++) {
            Item item = items[i];
            if (item.getName() == key) {
                items1[size] = item;
                size++;
            }
        }
        items1 = Arrays.copyOf(items1, size);
        return items1;
    }
}