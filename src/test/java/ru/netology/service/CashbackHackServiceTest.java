package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void testRemainWithNegativeAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = -1;

        int actual = service.remain(amount);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testRemainWithZeroAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
    }

    @Test
    public void testRemainWithAmountMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWithAmountNonMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 348;

        int expected = 652;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}