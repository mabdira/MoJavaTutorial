package com.tutorials_point.DataStructures.Map;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/2/13
 * Time: 5:59 PM
 * To change this template use File | Settings | File Templates.
 *
 * WeakHashMap is an implementation of the Map interface that stores only weak
 * references to its keys. Storing only weak references allows a key-value pair
 * to be garbage collected when its key is no longer referenced outside of the
 * WeakHashMap. It is useful for implementing "registry-like" data structures,
 * where the utility of an entry vanishes when its key is no longer reachable
 * by any thread.
 */
public class _WeakHashMap {
    public static void main(String[] args){
        // declare a weak hash map object
        final Map <String, String> weakHashMap = new WeakHashMap<String, String>();

        // add an element into the map
        weakHashMap.put(new String("Maine"), "Augusta");

        Runnable runner = new Runnable(){
            public void run(){
                while(weakHashMap.containsKey("Maine")){
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException ignored){

                    }
                }
                System.out.println("Thread waiting");
                System.gc();
            }
        };

        // kick off the thread
        Thread t = new Thread(runner);
        t.start();
        System.out.println("Main waiting");
        try{
            t.join();
        } catch(InterruptedException ignored){

        }
    }
}
