package io.github.hiepluong2205;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ChampCirQueueTest {
    @Test
    public void test1() {
        String[] arr1 = new String[]{"MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"};
        String[] result = new String[arr1.length];
        ChampCirQueue champCirQueue1 = new ChampCirQueue(5);
        champCirQueue1.enQueue(5);
        champCirQueue1.enQueue(13);
        champCirQueue1.enQueue(8);
        champCirQueue1.enQueue(2);
        champCirQueue1.enQueue(10);
        Assert.assertEquals(champCirQueue1.isFull(), true);
        champCirQueue1.deQueue();
        champCirQueue1.deQueue();
        champCirQueue1.enQueue(23);
        champCirQueue1.enQueue(6);
        Assert.assertEquals(champCirQueue1.isFull(), true);
        champCirQueue1.deQueue();
        champCirQueue1.deQueue();
        champCirQueue1.deQueue();
        champCirQueue1.deQueue();
        champCirQueue1.deQueue();
        Assert.assertEquals(champCirQueue1.isEmpty(), true);

        Assert.assertEquals(champCirQueue1.enQueue(123), true);
        Assert.assertEquals(champCirQueue1.deQueue(), true);
        Assert.assertEquals(champCirQueue1.Front(), 123);
        Assert.assertEquals(champCirQueue1.Rear(), 456);
    }

    @Test
    public void test2() {
        ChampCirQueue champCirQueue2 = new ChampCirQueue(3);
        Assert.assertEquals(champCirQueue2.enQueue(1), true);
        Assert.assertEquals(champCirQueue2.enQueue(2), true);
        Assert.assertEquals(champCirQueue2.enQueue(3), true);
        Assert.assertEquals(champCirQueue2.enQueue(4), false);
        Assert.assertEquals(champCirQueue2.Rear(), 3);
        Assert.assertEquals(champCirQueue2.isFull(), true);
        Assert.assertEquals(champCirQueue2.deQueue(), true);
        Assert.assertEquals(champCirQueue2.enQueue(4), true);
        Assert.assertEquals(champCirQueue2.Rear(), 4);
    }

    @BeforeMethod
    public void setUp() {

    }

    @AfterMethod
    public void tearDown() {

    }

}
