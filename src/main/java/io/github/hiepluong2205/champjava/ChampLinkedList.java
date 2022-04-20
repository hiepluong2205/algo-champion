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

import io.github.hiepluong2205.champjava.ChampArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChampLinkedList extends ChampSet {
    final Logger logger = LoggerFactory.getLogger(ChampLinkedList.class);
    int val;
    private SinglyListNode head;
    ChampLinkedList next;
    ChampLinkedList prev;

    // https://leetcode.com/explore/learn/card/linked-list/209/singly-linked-list/1290/
    public ChampLinkedList() {
        head = null;
        // val = x;
    }

    public int get(int index) {
        int num = 0;
        return num;
    }

    public void search(int[] l, int k) {
    }

    public void addAtHead(int val) {
    }

    public void addAtTail(int val) {
    }

    public void addAtIndex(int index, int val) {
    }

    public void deleteAtIndex(int index) {
    }
}

// Definition for singly-linked list.
class SinglyListNode {
    int val;
    SinglyListNode next;

    SinglyListNode(int x) {
        val = x;
    }
}
