package com.tutorials_point.DataStructures;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/3/13
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 * The collections framework defines several algorithms that can be applied to collections and maps.

 These algorithms are defined as static methods within the Collections class.
 Several of the methods can throw a ClassCastException, which occurs when an
 attempt is made to compare incompatible types, or an UnsupportedOperationException,
 which occurs when an attempt is made to modify an unmodifiable collection.
 */
public class CollectionAlgorithms {
    public static void main(String[] args){
        // Create and initialize linked list
        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(new Integer(-8));
        linkedList.add(new Integer(20));
        linkedList.add(new Integer(-20));
        linkedList.add(new Integer(8));

        // Create a reverse order comparator
        Comparator r = Collections.reverseOrder();
        // Sort list by using the comparator
        Collections.sort(linkedList, r);
        // Get iterator
        Iterator iter = linkedList.iterator();
        System.out.println("List sorted in reverse order: ");
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // Display randomized list by shuffling it
        Collections.shuffle(linkedList);
        System.out.println("Shuffled list: ");
        for(Integer i : linkedList){
            System.out.print(i + " ");
        }
        System.out.println();

        // Display the Maximum and Minimum numbers in the list
        System.out.println("Maximum number is: " + Collections.max(linkedList));
        System.out.println("Minimum number is: " + Collections.min(linkedList));

        // Display and use the BinarySearch algorithm
        System.out.println("BinarySearch for value 8: "
                        + Collections.binarySearch(linkedList, new Integer(8)));
    }
}
