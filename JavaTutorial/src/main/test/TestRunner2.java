package main.test;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 3:13 PM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner2 {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(TestJunit2.class);

        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println("Result was successful? "
                            + result.wasSuccessful());
    }
}
