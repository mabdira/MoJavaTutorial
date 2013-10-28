package com.tutorials_point.MultiThreading.caveofprogramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/7/13
 * Time: 1:10 AM
 * To change this template use File | Settings | File Templates.
 */

class Connection {

    // Data variable
    private static Connection instance = new Connection();
    // Semaphore object of 10 at a time
    private Semaphore sem = new Semaphore(10, true);
    // Reentrant lock for synchronization
    Lock lock1 = new ReentrantLock(true);

    private int connections = 0;

    private Connection() {

    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {
            sem.acquire();
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            doConnect();
        } finally {

            sem.release();
        }
    }

    public void doConnect() {

        lock1.lock();
        try{
            connections++;
            System.out.println("Current connections: " + connections);
        }
        finally{
            lock1.unlock();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        lock1.lock();
        try{
            connections--;
        }
        finally{
            lock1.unlock();
        }

    }
}


public class Semaphores {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i=0; i < 200; i++) {
            executor.submit(new Runnable() {
                public void run() {
                    Connection.getInstance().connect();
                }
            });
        }

        executor.shutdown();

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
