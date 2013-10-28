package com.tutorials_point.MultiThreading.caveofprogramming;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/7/13
 * Time: 1:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class InterruptingThreads {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting.");

        ExecutorService exec = Executors.newCachedThreadPool();

        Future<?> fu = exec.submit(new Callable <Void>() {

            @Override
            public Void call() throws Exception {
                Random ran = new Random();

                for (int i = 0; i < 1E8; i++) {

                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interrupted!");
                        break;
                    }

                    Math.sin(ran.nextDouble());
                }
                return null;
            }

        });

        exec.shutdown();

        Thread.sleep(500);

        // both of these functions throw out interrupted exception
        //exec.shutdownNow();
        fu.cancel(true);

        exec.awaitTermination(1, TimeUnit.DAYS);

        System.out.println("Finished.");
    }

}
