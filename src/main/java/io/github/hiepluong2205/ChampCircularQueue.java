package io.github.hiepluong2205;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ChampCircularQueue {
    // store elements
    private List<Integer> newCirQueue;
    final static Logger loggerChampCircularQueue = LoggerFactory.getLogger(ChampCircularQueue.class);

    // a pointer to indicate the start position
    private int p_head;
    private int p_tail;

    public ChampCircularQueue(int k) {
        newCirQueue = new ArrayList<Integer>();
        loggerChampCircularQueue.debug(newCirQueue.toString());
        p_head = 0;
        p_tail = k;

    }

    /**
     * Insert an element into the queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        newCirQueue.add(value);
        return true;
    }

    /**
     * Delete an element from the queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_head++;
        return true;

    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
// loggerChampCircularQueue.debug(p_head);
        return newCirQueue.get(p_head);
    }

    public int Rear() {
        int result = 0;
        return result;

    }

    /**
     * Checks whether the queue is empty or not.
     */
    public boolean isEmpty() {
        return p_head >= newCirQueue.size();
    }

    public boolean isFull() {
        boolean result = false;
        return result;
    }
}