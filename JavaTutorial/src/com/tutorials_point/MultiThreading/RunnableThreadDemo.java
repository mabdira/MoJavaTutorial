package com.tutorials_point.MultiThreading;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
class NewThread implements Runnable{

    // data variable
    Thread t;

    public NewThread() {
        // Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
    }

    // This is the entry point for the second thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.printf("Child Thread: %d", i);
                System.out.println();
                // Let the thread sleep for a while.
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class RunnableThreadDemo {
    public static void main(String[] args){
        // create a new thread and run it
        new NewThread();

        try {
            for(int i = 5; i > 0; i--) {
                System.out.printf("Main Thread: %d", i);
                System.out.println();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
