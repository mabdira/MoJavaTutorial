package main.test;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/12/13
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args){
        // get the result
        Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);

        // traverse through the results and print out failures
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println("Result was successful: "
                            + result.wasSuccessful());
    }
}
