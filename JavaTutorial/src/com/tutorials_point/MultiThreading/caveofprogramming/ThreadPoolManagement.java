package com.tutorials_point.MultiThreading.caveofprogramming;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/6/13
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.concurrent.*;


class Processor implements Runnable {

    private int id;

    public Processor(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "id=" + id +
                '}';
    }

    public void run() {
        System.out.println("Starting: " + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Completed: " + id);
    }
}

class FactoryProcessorThread implements ThreadFactory{
    @Override
    public Thread newThread(final Runnable r) {
        System.out.println("New Thread created: " + r.toString());
        return new Thread(r);
    }
}


public class ThreadPoolManagement {

    public static void main(String[] args) {
        // Tests newFixedThreadPool, Runnable,
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for(int i=0; i<5; i++) {
            executor.submit(new Processor(i));
        }

        executor.shutdown();

        System.out.println("All tasks submitted to FixedThreadPool(2).");

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
        }

        System.out.println("All tasks completed for FixedThreadPool(2).\n\n");
        System.out.println("-----------------------------------------------");

        // Tests ThreadFactory, Callable, CachedThreadPool
        // create a new thread factor
        FactoryProcessorThread threadFactory = new FactoryProcessorThread();
        // create an executor service of type ChachedThreadPool
        ExecutorService executor2 = Executors.newCachedThreadPool(threadFactory);
        // submit some workers into the executor
        for(int i=0; i<5; i++) {
            executor2.submit(new Processor(i));
        }
        // shutdown the executor not accept any new workers for submission
        executor2.shutdown();
        System.out.println("All tasks submitted to CachedThreadPool.");

        // wait for all workers to terminate for completion for one day
        try {
            executor2.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            System.out.println("Executor2 has not terminated successfully");
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("All tasks completed for CachedThreadPool.");
    }
}