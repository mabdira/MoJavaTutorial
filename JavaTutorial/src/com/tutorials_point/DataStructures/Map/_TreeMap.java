package com.tutorials_point.DataStructures.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/2/13
 * Time: 5:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class _TreeMap {
    public static void main(String args[]) {
        // Create a hash map
        Map<String, Double> tm = new TreeMap<String, Double>();
        // Put elements to the map
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        Set set = tm.entrySet();
        // Get an iterator
        Iterator i = set.iterator();
        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // Deposit 1000 into Zara's account
        double balance = ((Double)tm.get("Zara")).doubleValue();
        tm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " +
                tm.get("Zara"));
    }
}
