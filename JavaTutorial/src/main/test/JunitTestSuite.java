package main.test;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */

import junit.framework.TestFailure;
import junit.framework.TestSuite;
import junit.framework.TestResult;
import org.junit.runner.notification.Failure;

import java.util.Enumeration;

public class JunitTestSuite {
    public static void main(String[] args){
        // add the test's in the suite
        TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class,
                                        TestJunit3.class);

        // create a TestResult to collect their results
        TestResult result = new TestResult();

        // run the suite and pass the result object to collect results
        suite.run(result);

        // print out the result information
        System.out.println("-------------------------------------------");
        System.out.println("Number of test cases = " + result.runCount());
        System.out.println("Get the name of the test suite = " + suite.getName());
        System.out.println("The number of test cases that will be run by "
                + "this test suite = " + suite.countTestCases());
        System.out.println("The number of tests in this suite = " + suite.testCount());
        System.out.println("Returns the test at the given index 0 = " + suite.testAt(0));
        System.out.println("Result was successful? = " + result.wasSuccessful());
        System.out.println("Get the number of detected errors = " + result.errorCount());
        System.out.println("Get the number of detected failures = " + result.failureCount());
        // print out the failures
        Enumeration<TestFailure> failures = result.failures();
        while(failures.hasMoreElements()){
            System.out.println("Failure = " + failures.nextElement().toString());
        }
        // print out the errors
        Enumeration<TestFailure> errors = result.errors();
        while(errors.hasMoreElements()){
            System.out.println("Error = " + errors.nextElement().toString());
        }


    }
}
