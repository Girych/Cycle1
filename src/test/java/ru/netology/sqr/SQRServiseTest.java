package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class SQRServiseTest {
    @Test
    public void shouldFindCount() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);

    }

    @Test

    public void shouldFindCount2() {
        SQRService service = new SQRService();
        int actual = service.calculate(100, 500);
        int expected = 13;
        assertEquals(expected, actual);
    }
}

