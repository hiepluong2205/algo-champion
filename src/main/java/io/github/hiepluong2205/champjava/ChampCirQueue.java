package io.github.hiepluong2205.champjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class ChampCirQueue {
    final static Logger loggerChampCirQueue = LoggerFactory.getLogger(ChampCirQueue.class);

    // store elements
    private List<Integer> champCirQueue;

    // a pointer to indicate the start position
    private int p_head;
    private int p_tail;

    public ChampCirQueue(int k) {
        champCirQueue = new ArrayList<Integer>(k);
        p_head = 0;
        p_tail = k;
//        for (int i = 0; i < k; i++) {
////            champCirQueue.add(k[i]);
//        }
//        loggerChampCirQueue.debug(String.valueOf(champCirQueue));
    }

    /**
     * Insert an element into the queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            loggerChampCirQueue.debug("champCirQueue full!");
        } else {
            loggerChampCirQueue.debug(String.valueOf(p_tail));
            champCirQueue.add(value);
            loggerChampCirQueue.debug(String.valueOf(p_tail));
        }
        if (p_tail < champCirQueue.size() - 1) {
            p_tail++;
        } else {
            p_tail = 0;
        }
        loggerChampCirQueue.debug(String.valueOf(p_tail));
        return true;
    }

    /**
     * Delete an element from the queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty() == true) {
            loggerChampCirQueue.debug("empty already!");
            return false;
        } else {
            champCirQueue.remove(p_head);
            loggerChampCirQueue.debug(String.valueOf(champCirQueue));
            p_head++;

            if (p_tail < champCirQueue.size() - 1) {
                p_head++;
            } else {
                p_head = 0;
            }
            return true;
        }
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
// loggerChampCircularQueue.debug(p_head);
        return champCirQueue.get(p_head);
    }

    public int Rear() {
        int result = 0;
        return champCirQueue.get(p_tail);

    }

    /**
     * Checks whether the queue is empty or not.
     */
    public boolean isEmpty() {
        return abs(p_head - p_tail) > 0;
    }

    public boolean isFull() {
        return p_tail >= champCirQueue.size();
    }
}