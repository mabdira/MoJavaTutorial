package com.tutorials_point.DataStructures.Set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/2/13
 * Time: 4:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class _LinkedHashSet {
    public static void main(String[] args){
        // create a hash set
        Set<String> lhs = new LinkedHashSet<String>();
        // add elements to the hash set
        lhs.add("B");
        lhs.add("A");
        lhs.add("D");
        lhs.add("E");
        lhs.add("C");
        lhs.add("F");
        // display the content of the linked hash set
        System.out.println(lhs);
    }
}
