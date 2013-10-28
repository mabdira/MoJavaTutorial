package com.tutorials_point.MultiThreading.caveofprogramming;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/7/13
 * Time: 1:36 AM
 * To change this template use File | Settings | File Templates.
 *
 * How to use Callable and Future in Java to get results from your threads and
 * to allow your threads to throw exceptions. Plus, Future allows you to
 * control your threads, checking to see if they’re running or not, waiting
 * for results and even interrupting them or descheduling them.
 */

public class CallableFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<Integer> future = executor.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int duration = random.nextInt(4000);

                if(duration > 2000) {
                    throw new IOException("Sleeping for too long.");
                }

                System.out.println("Starting ...");

                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                System.out.println("Finished.");

                return duration;
            }

        });

        executor.shutdown();


        try {
            System.out.println("Result is: " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            IOException ex = (IOException) e.getCause();

            System.out.println(ex.getMessage());
        }
    }
}
