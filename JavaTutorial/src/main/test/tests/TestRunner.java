package main.test.tests;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 5:44 PM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(JunitTestSuite.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println("Result was successful? = " + result.wasSuccessful());

    }
}
