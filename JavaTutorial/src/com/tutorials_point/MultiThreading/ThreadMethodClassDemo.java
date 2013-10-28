package com.tutorials_point.MultiThreading;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 *
 * The following ThreadClassDemo program demonstrates some of these methods of the
 * Thread class
 */

// Create a display message thread to implement Runnable
class DisplayMessage implements Runnable
{
    private String message;
    public DisplayMessage(String message)
    {
        this.message = message;
    }
    public void run()
    {
        while(true)
        {
            System.out.println(message);
        }
    }
}

// Create a thread to extentd Thread
class GuessANumber extends Thread
{
    private int number;
    public GuessANumber(int number)
    {
        this.number = number;
    }
    public void run()
    {
        int counter = 0;
        int guess = 0;
        do
        {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName()
                    + " guesses " + guess);
            counter++;
        }while(guess != number);
        System.out.println("** Correct! " + this.getName()
                + " in " + counter + " guesses.**");
    }
}

public class ThreadMethodClassDemo {
    public static void main(String[] args){
        /////// Hello Thread ////////////////
        Runnable hello = new DisplayMessage("Hello");
        Thread t1 = new Thread(hello);
        t1.setDaemon(true); // let's the thread run in the background when JVM exits
        t1.setName("hello");
        System.out.println("Starting hello thread...");
        t1.start();

        /////// Goodbye Thread ///////////////
        Runnable goodbye = new DisplayMessage("Goodbye");
        Thread t2 = new Thread(goodbye);
        t2.setDaemon(true);
        t2.setName("goodbye");
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Starting goodbye thread...");
        t2.start();

        ////// GuessNumber Thread ///////////
        Thread t3 = new GuessANumber(10);
        t3.setName("guess");
        System.out.println("Starting guess-number thread...");
        t3.start();

        // cause the main current thread to wait until t3 thread terminates
        try {
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main() thread is interrupted before t3 thread finished");
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.println("main() thread is ending ......");
    }
}
