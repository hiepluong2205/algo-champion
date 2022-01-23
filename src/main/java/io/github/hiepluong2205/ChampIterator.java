package io.github.hiepluong2205;

import java.util.ArrayList;
import java.util.Iterator;

// https://www.hackerrank.com/challenges/java-iterator/problem?h_r=internal-search&isFullScreen=true
// https://www.w3schools.com/java/java_iterator.asp
public class ChampIterator {
    public void method1(ArrayList arr) {
        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
    public void stdIn(){}
    public void stdOut(){}

}
