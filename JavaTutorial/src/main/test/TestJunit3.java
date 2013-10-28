package main.test;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */

import junit.framework.TestResult;
import junit.framework.AssertionFailedError;
import org.junit.Test;

public class TestJunit3 extends TestResult {

    // add the error
    public synchronized void addError(Test test, Throwable t){
        super.addError((junit.framework.Test) test, t);
    }

    // add the failure
    public synchronized void addFailure(Test test, AssertionFailedError t){
        super.addFailure((junit.framework.Test) test, t);
    }

    @Test
    public void testAdd(){
        // add any test here
    }

    // marks the that the test run should stop
    public synchronized void stop(){
        // stop the test here
    }



}
