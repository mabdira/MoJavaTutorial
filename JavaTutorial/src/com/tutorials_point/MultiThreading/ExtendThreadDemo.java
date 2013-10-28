package com.tutorials_point.MultiThreading;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 10:11 PM
 * To change this template use File | Settings | File Templates.
 */

class NewThreadSecond extends Thread{
    // Constructor
    public NewThreadSecond(){
        // Create a new thread and start it
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        this.start();
    }

    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                // Let the thread sleep for a while.
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class ExtendThreadDemo {

    public static void main(String args[]) {
        new NewThreadSecond(); // create a new thread
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");

    }
}
