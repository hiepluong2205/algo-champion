package io.github.hiepluong2205;

import org.testng.annotations.Test;

public class CircularQueueTest {
    @Test
    public void test1() {
        ChampCircularQueue champCircularQueue1 = new ChampCircularQueue(123);
        boolean param_1 = champCircularQueue1.enQueue(123);
        boolean param_2 = champCircularQueue1.deQueue();
        int param_3 = champCircularQueue1.Front();
        int param_4 = champCircularQueue1.Rear();
        boolean param_5 = champCircularQueue1.isEmpty();
        boolean param_6 = champCircularQueue1.isFull();
    }
}
