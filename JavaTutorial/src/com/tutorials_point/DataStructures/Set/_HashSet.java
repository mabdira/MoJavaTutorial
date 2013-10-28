package com.tutorials_point.DataStructures.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/2/13
 * Time: 4:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class _HashSet {
    public static void main(String[] args){
        // create a hash set object
        Set<String> hashSet = new HashSet<String>();

        // add elements into the hash set object
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("C");
        hashSet.add("F");

        // Iteration of hash Set
        for(String s : hashSet){
            System.out.println(s);
        }

        // print out the list of hash set
        System.out.println(hashSet);

        // display the hash code of the hashset object
        System.out.println("Hash code number: " + hashSet.hashCode());
    }
}
