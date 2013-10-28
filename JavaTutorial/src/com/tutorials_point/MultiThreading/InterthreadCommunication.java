package com.tutorials_point.MultiThreading;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/6/13
 * Time: 12:46 AM
 * To change this template use File | Settings | File Templates.
 *
 * Consider the classic queuing problem, where one thread is producing some data
 * and another is consuming it. To make the problem more interesting, suppose that
 * the producer has to wait until the consumer is finished before it generates more
 * data.
 *
 * In a polling system, the consumer would waste many CPU cycles while it waited
 * for the producer to produce. Once the producer was finished, it would start
 * polling, wasting more CPU cycles waiting for the consumer to finish, and so on.
 * Clearly, this situation is undesirable.
 *
 * To avoid polling, Java includes an elegant interprocess communication mechanism
 * via the following methods:
 *       wait( ): This method tells the calling thread to give up the monitor and
 *              go to sleep until some other thread enters the same monitor and
 *              calls notify( ).
 *       notify( ): This method wakes up the first thread that called wait( ) on
 *                  the same object.
 *       notifyAll( ): This method wakes up all the threads that called wait( ) on
 *                    the same object.c The highest priority thread will run first.
 */

// The Queue class trying to synchronize it.
class Q{
    // private variable data
    private int n;
    private boolean valueSet = false;

    // a synchronized get method from the queue
    public synchronized int get(){
        if(!valueSet){
            try{
                wait();
            } catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }

        System.out.println("Got " + n);
        valueSet = false;
        notify();
        return n;
    }

    // a synchronized put method from the queue
    public synchronized void put(int n){
        if(valueSet){
            try{
                wait();
            } catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

// The consumer class
class Consumer implements Runnable{
    // private data variables
    private Q q;

    // constructor
    public Consumer(Q q){
        this.q = q;
    }

    @Override
    public void run() {
        while(true){
           q.get();
        }
    }
}

// The producer class
class Producer implements Runnable{
    // variable data
    private Q q;

    // constructor
    public Producer(Q q){
        this.q = q;
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            q.put(i);
            ++i;
        }
    }
}

// Main class
public class InterthreadCommunication {
    public static void main(String[] args){
        // create the queue object
        Q q = new Q();

        // Create the consumer and producer runnable objects
        Runnable consumer = new Consumer(q);
        Runnable producer = new Producer(q);

        // Create the threads and start them
        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);
        t1.start();
        t2.start();

        System.out.println("Press Control-C to stop.");
    }
}
