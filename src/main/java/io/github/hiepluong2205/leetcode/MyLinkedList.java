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

package io.github.hiepluong2205.leetcode;

import io.github.hiepluong2205.champjava.ChampSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLinkedList extends ChampSet {
    final Logger logger = LoggerFactory.getLogger(ChampArray.class);
    static int val;
    static MyLinkedList next;
    MyLinkedList prev;

    // https://leetcode.com/explore/learn/card/linked-list/209/singly-linked-list/1290/
    // MyLinkedList() Initializes the MyLinkedList object.
    public MyLinkedList() {
        //        val = x;
    }

    // int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
    public int get(int index) {
        for (int i = 0; i <=index; i++) {
            val = MyLinkedList.next.val;
        }
        if (true) {
            return MyLinkedList.val;
        } else {

            return -1;
        }
    }

    public void search(int[] l, int k) {
    }

    // void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
    public void addAtHead(int val) {
    }

    // void addAtTail(int val) Append a node of value val as the last element of the linked list.
    public void addAtTail(int val) {
    }

    // void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
    public void addAtIndex(int index, int val) {
    }

    // void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
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
