/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date:
 * Date Submitted:
 *
 * - https://deanza.instructure.com/courses/23660/assignments
 * - https://discord.com/channels/927730169152675841/927730169731493972
 */

/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date:
 * Date Submitted:
 *
 * - https://deanza.instructure.com/courses/23660/assignments
 * - https://discord.com/channels/927730169152675841/927730169731493972
 */

package io.github.hiepluong2205.champjava;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1369/
public class ChampStack extends ChampSet {
    private List<Integer> data; // store elements

    public ChampStack() {
        data = new ArrayList<>();
    }

    public void isEmpty(ChampStack S) {
    }

    public void isFull(ChampStack S) {
    }

    public void push(ChampStack S, int value) {
    }

    public void pop(ChampStack S) {
    }

    /**
     * Insert an element into the stack.
     */
    public void push(int x) {
        data.add(x);
    }

    /**
     * Checks whether the queue is empty or not.
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Get the top item from the queue.
     */
    public int top() {
        return data.get(data.size() - 1);
    }

    /**
     * Delete an element from the queue. Return true if the operation is successful.
     */
    public boolean pop() {
        if (isEmpty()) {
            return false;
        }
        data.remove(data.size() - 1);
        return true;
    }

}
