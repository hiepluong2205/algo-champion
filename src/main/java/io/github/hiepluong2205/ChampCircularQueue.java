package io.github.hiepluong2205;

import java.util.ArrayList;
import java.util.List;

public class ChampCircularQueue {
    // store elements
    private List<Integer> champCirQueue;
//    final static Logger loggerChampCircularQueue = LoggerFactory.getLogger(ChampCircularQueue.class);

    // a pointer to indicate the start position
    private int[] data;
    private int p_head, p_tail, size;

    public ChampCircularQueue(int k) {
        champCirQueue = new ArrayList<Integer>();
//        loggerChampCircularQueue.debug(newCirQueue.toString());
        data = new int[k];
        p_head = -1;
        p_tail = -1;
        size = k;

    }

    /**
     * Insert an element into the queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            p_head = 0;
        }
        p_tail = (p_tail + 1) % size;
        data[p_tail] = value;
        return true;
    }

    /**
     * Delete an element from the queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (p_head == p_tail) {
            p_head = -1;
            p_tail = -1;
            return true;
        }
        p_head = (p_head + 1) % size;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[p_head];
    }

    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[p_tail];
    }

    /**
     * Checks whether the queue is empty or not.
     */
    public boolean isEmpty() {
        return p_head == -1;
    }

    public boolean isFull() {
        return ((p_tail + 1) % size) == p_head;
    }
}