package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {


    @Test
    public void remainWithAmountMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 4000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWithAmountNonMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 795;

        int expected = 205;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWithNegativeAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = -1;

        Assert.assertThrows(RuntimeException.class, ()->{

            int actual = service.remain(amount);
        });
    }

    @Test
    public void remainWithZeroAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        Assert.assertThrows(RuntimeException.class, ()->{

            int actual = service.remain(amount);
        });
    }
}