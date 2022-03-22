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

import org.testng.annotations.Test;

public class ChampLinkedListTest {

    @Test
    public void test1() {
        ChampLinkedList obj = new ChampLinkedList();
        int index = 0, val = 0;
        int param_1 = obj.get(index);
        obj.addAtHead(val);
        obj.addAtTail(val);
        obj.addAtIndex(index, val);
        obj.deleteAtIndex(index);
    }
}