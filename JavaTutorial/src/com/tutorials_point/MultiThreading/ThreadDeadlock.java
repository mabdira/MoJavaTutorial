package com.tutorials_point.MultiThreading;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/6/13
 * Time: 1:18 AM
 * To change this template use File | Settings | File Templates.
 *
 * A special type of error that you need to avoid that relates specifically to
 * multitasking is deadlock, which occurs when two threads have a circular
 * dependency on a pair of synchronized objects.
 *
 * For example, suppose one thread enters the monitor on object X and another
 * thread enters the monitor on object Y. If the thread in X tries to call any
 * synchronized method on Y, it will block as expected. However, if the thread in
 * Y, in turn, tries to call any synchronized method on X, the thread waits forever,
 * because to access X, it would have to release its own lock on Y so that the
 * first thread could complete.
 */

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("A Interrupted");
        }
        System.out.println(name + " trying to call B.last()");
        b.last();
    }
    synchronized void last() {
        System.out.println("Inside A.last");
    }
}
class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("B Interrupted");
        }
        System.out.println(name + " trying to call A.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("Inside B.last");
    }
}


public class ThreadDeadlock implements Runnable{
    A a = new A();
    B b = new B();
    ThreadDeadlock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        a.foo(b); // get lock on a in this thread.
        System.out.println("Back in main thread");
    }
    public void run() {
        b.bar(a); // get lock on b in other thread.
        System.out.println("Back in other thread");
    }
    public static void main(String args[]) {
        new ThreadDeadlock();
    }
}
