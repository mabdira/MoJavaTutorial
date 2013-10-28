package com.tutorials_point.DataStructures.Set;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/2/13
 * Time: 5:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class _TreeSet {
    public static void main(String args[]) {
        // Create a tree set
        Set<String> ts = new TreeSet<String>();
        // Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // print out the tree using iteration
        for(String s : ts){
            System.out.println(s);
        }

        System.out.println(ts);
    }
}
