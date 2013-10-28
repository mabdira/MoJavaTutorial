package com.tutorials_point.DataStructures.Map;

import com.sun.javafx.collections.MappingChange;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/2/13
 * Time: 6:47 PM
 * To change this template use File | Settings | File Templates.
 * It is similar to HashMap except that it uses reference equality
 * when comparing elements.
 *
 * This class is not a general-purpose Map implementation. While this class
 * implements the Map interface, it intentionally violates Map's general
 * contract, which mandates the use of the equals method when comparing objects.
 *
 * This class is designed for use only in the rare cases wherein reference-equality
 * semantics are required
 */
public class _IdentityHashMap {
    public static void main(String args[]) {
        // Create a hash map
        Map ihm = new IdentityHashMap();
        // Put elements to the map
        ihm.put("Zara", new Double(3434.34));
        ihm.put("Mahnaz", new Double(123.22));
        ihm.put("Ayan", new Double(1378.00));
        ihm.put("Daisy", new Double(99.22));
        ihm.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        Set set = ihm.entrySet();
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
        double balance = ((Double)ihm.get("Zara")).doubleValue();
        ihm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " +
                ihm.get("Zara"));
    }
}
