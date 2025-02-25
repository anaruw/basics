package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {


    @org.junit.Test
    public void remainWithAmountMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 4000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainWithAmountNonMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 795;

        int expected = 205;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainWithNegativeAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = -1;

        Assert.assertThrows(RuntimeException.class, ()->{

            int actual = service.remain(amount);
        });
    }

    @org.junit.Test
    public void remainWithZeroAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        Assert.assertThrows(RuntimeException.class, ()->{

            int actual = service.remain(amount);
        });
    }

    @org.junit.jupiter.api.Test
    public void jupiterRemainWithAmountMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 4000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void jupiterRemainWithAmountNonMultipleOfBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 795;

        int expected = 205;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void jupiterRemainWithNegativeAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = -1;

        Assertions.assertThrows(RuntimeException.class, ()->{

            int actual = service.remain(amount);
        });
    }

    @org.junit.jupiter.api.Test
    public void jupiterRemainWithZeroAmount() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        Assertions.assertThrows(RuntimeException.class, ()->{

            int actual = service.remain(amount);
        });
    }
}