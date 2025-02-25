package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test(expectedExceptions = RuntimeException.class)
    public void testRemainWithNegativeAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = -1;

        int actual = service.remain(amount);
    }

    @org.testng.annotations.Test(expectedExceptions = RuntimeException.class)
    public void testRemainWithZeroAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
    }

    @org.testng.annotations.Test
    public void testRemainWithAmountMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainWithAmountNonMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 348;

        int expected = 652;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}