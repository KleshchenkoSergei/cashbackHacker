package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldTestUnderZero() {

        int expected = 1000;
        int actual=service.remain(-1);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestZero() {

        int expected = 1000;
        int actual=service.remain(0);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestTwo() {

        int expected = 998;
        int actual=service.remain(2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTest998() {

        int expected = 2;
        int actual=service.remain(998);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTest999() {

        int expected = 1;
        int actual=service.remain(999);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTest1000() {

        int expected = 0;
        int actual=service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTest1001() {

        int expected = 999;
        int actual=service.remain(1001);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTest1002() {

        int expected = 998;
        int actual=service.remain(1002);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTest1998() {

        int expected = 2;
        int actual=service.remain(1998);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTest1999() {

        int expected = 1;
        int actual=service.remain(1999);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTest2000() {

        int expected = 0;
        int actual=service.remain(2000);

        assertEquals(expected, actual);
    }

}