package io.github.hiepluong2205;

import io.github.hiepluong2205.champjava.ChampLinkedList;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChampLinkedListTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void test1() {
        ChampLinkedList champLinkedList1 = new ChampLinkedList();
        champLinkedList1.addAtHead(1);
        champLinkedList1.addAtTail(3);
        champLinkedList1.addAtIndex(1, 2);    // linked list becomes 1->2->3
        Assert.assertEquals(champLinkedList1.get(1), 2);
        champLinkedList1.deleteAtIndex(1);    // now the linked list is 1->3
        Assert.assertEquals(champLinkedList1.get(1), 3);
    }
}
