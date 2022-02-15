package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class ItemTest {

    @Test
    public void whenSortAscByName() {
        List<Item> items = Arrays.asList(
                new Item(2, "BBBB"),
                new Item(3, "AAAA"),
                new Item(1, "CCCC")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "AAAA"),
                new Item(2, "BBBB"),
                new Item(1, "CCCC")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void whenSortDescByName() {
        List<Item> items = Arrays.asList(
                new Item(2, "BBBB"),
                new Item(3, "AAAA"),
                new Item(1, "CCCC")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(1, "CCCC"),
                new Item(2, "BBBB"),
                new Item(3, "AAAA")
        );
        assertThat(items, is(expected));
    }
}
