package com.tutorials_point.DataStructures.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/2/13
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class _ArrayList {
    public static void main(String[] args){
        // Create an Array List object
        List<String> arrayList = new ArrayList<String>();
        System.out.println("Initial size of array list: " + arrayList.size());

        // add elements to the array list
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1, "A2");
        System.out.println("Size of array list after additions: " + arrayList.size());

        // display the array list
        System.out.println("Contents of array list: ");
        for(String s : arrayList){
            System.out.println(s);
        }

        // Remove elements from the array list
        arrayList.remove("F");
        arrayList.remove(2);
        System.out.println("Size of the array list after deletions: " + arrayList.size());
        System.out.println("Contents of array list: " + arrayList.toString());

    }
}
