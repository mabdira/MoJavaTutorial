package com.tutorials_point.DataStructures.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/2/13
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class _HashMap {
    public static void main(String[] args){
        // create a hash map object
        Map<String, Double> hashMap = new HashMap<String, Double>();

        // Put elements on the map
        hashMap.put("Zara", new Double(3434.34));
        hashMap.put("Mahnaz", new Double(123.22));
        hashMap.put("Ayan", new Double(1378.00));
        hashMap.put("Daisy", new Double(99.22));
        hashMap.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        // Set set = hashMap.entrySet();

        // display the elements
        for(Map.Entry<String, Double> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Deposit 1000 into Zara's account
        Double deposit = hashMap.get("Zara") + 1000.00;
        hashMap.put("Zara", new Double(deposit));
        System.out.println("\nZara's new balance after 1000.00 deposit: " + hashMap.get("Zara"));
    }
}
