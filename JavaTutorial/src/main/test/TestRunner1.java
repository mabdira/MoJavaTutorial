package main.test;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class TestRunner1 {
    public static void main(String[] args){
        // run the TestJunit class
        Result result = JUnitCore.runClasses(TestJunit1.class);

        // loop through each of the failures
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println("Result was successful? -> "
                            + result.wasSuccessful());
    }
}
