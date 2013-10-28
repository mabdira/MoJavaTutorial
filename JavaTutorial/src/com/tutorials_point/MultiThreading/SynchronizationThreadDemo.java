package com.tutorials_point.MultiThreading;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/6/13
 * Time: 12:32 AM
 * To change this template use File | Settings | File Templates.
 */

class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

// File Name : Caller.java
class Caller implements Runnable {
    // private instance variables
    private String msg;
    private Callme target;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
    }

    // synchronize calls to call()
    public void run() {
        synchronized(target) {
        // synchronized block
            target.call(msg);
        }
    }
}

public class SynchronizationThreadDemo {
    public static void main(String[] args){
        // Create the object to lock and synchronize threads
        Callme target = new Callme();

        // Create the threads
        Thread t1 = new Thread(new Caller(target, "Hello"));
        t1.start();
        Thread t2 = new Thread(new Caller(target, "Synchronized"));
        t2.start();
        Thread t3 = new Thread(new Caller(target, "World"));
        t3.start();

        // Make main() thread to wait for other threads to finish
        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ie){
            System.out.println("Main() Thread has been interrupted");
            ie.printStackTrace();
        }
    }
}
