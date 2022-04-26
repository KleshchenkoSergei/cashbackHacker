package ru.netology.service;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    void shouldTestUnderZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual=service.remain(-1);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTestZero() {

        int expected = 1000;
        int actual=service.remain(0);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTestTwo() {

        int expected = 998;
        int actual=service.remain(2);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTest998() {

        int expected = 2;
        int actual=service.remain(998);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTest999() {

        int expected = 1;
        int actual=service.remain(999);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTest1000() {

        int expected = 0;
        int actual=service.remain(1000);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTest1001() {

        int expected = 999;
        int actual=service.remain(1001);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTest1002() {

        int expected = 998;
        int actual=service.remain(1002);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTest1998() {

        int expected = 2;
        int actual=service.remain(1998);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTest1999() {

        int expected = 1;
        int actual=service.remain(1999);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldTest2000() {

        int expected = 0;
        int actual=service.remain(2000);

        assertEquals(actual, expected);
    }

}