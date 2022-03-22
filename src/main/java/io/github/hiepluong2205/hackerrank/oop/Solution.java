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

package io.github.hiepluong2205.hackerrank.oop;

public class Solution {
    public static void main(String[] args) {
    }
}

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
    }
}

class Arithmetic {
    int add(int int1, int int2) {
        return int1 + int2;
    }
}

class Adder extends Arithmetic {
    public void main(String[] args) {
        super.add(1, 2);
    }
}
