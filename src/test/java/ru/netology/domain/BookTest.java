package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    public void shouldUseMethods() {
        Book book = new Book();
    }

    @Test
    public void shouldUseEquals() {
        Book book1 = new Book(3, "B1", 99, "A1", 101,2022);
        Book book2 = new Book(3, "B1", 99, "A1", 101,2022);

        assertEquals(book1, book2);
    }
}