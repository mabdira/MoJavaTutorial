package com.tutorials_point.MultiThreading.caveofprogramming;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/6/13
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */

public class WaitNotifyProducerConsumer {

    private static LinkedList<Integer> list = new LinkedList<Integer>();
    private static final int LIMIT = 10;
    private static Object lock = new Object();

    public static void produce() throws InterruptedException {

        int value = 0;

        while (true) {

            synchronized (lock) {

                while(list.size() == LIMIT) {
                    lock.wait();
                }

                list.add(value++);
                lock.notify();
            }

        }
    }

    public static void consume() throws InterruptedException {

        Random random = new Random();

        while (true) {

            synchronized (lock) {

                while(list.size() == 0) {
                    lock.wait();
                }

                System.out.print("List size is: " + list.size());
                int value = list.removeFirst();
                System.out.println("; value is: " + value);
                lock.notify();
            }

            Thread.sleep(random.nextInt(1000));
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    consume();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
 }

}
