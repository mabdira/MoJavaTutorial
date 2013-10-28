package com.tutorials_point.DataStructures.List;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/2/13
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class _LinkedList {
    public static void main(String[] args){
        // create a linked list object
        LinkedList<String> linkedList = new LinkedList<String>();

        // add elements into the list
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "A2");
        System.out.println("Original contents of linked list: ");
        for(String s : linkedList){
            System.out.print(s + " ");
        }
        System.out.println();

        // remove elements from the linked list
        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("Contents of linked list after deletion: " + linkedList);

        // remove elements from the first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Contents of linked list after deleting first and last: "
                            + linkedList);

        // get and set value
        String s = linkedList.get(2);
        linkedList.set(2, s + " Changed");
        System.out.println("Contents of linked list ater change: " + linkedList);
    }
}