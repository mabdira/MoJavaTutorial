package main.test;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class TestJunit2 extends TestCase {
    protected double fValue1;
    protected double fValue2;

    @Before
    public void setup(){
        fValue1 = 2.0;
        fValue2 = 3.0;
    }

    @Test
    public void testAdd(){
        // count the number of test cases
        System.out.println("No of Testcase = "
                            + this.countTestCases());

        // test getName
        System.out.println("Testcase Name = "
                            + this.getName());

        // test setName
        this.setName("testNewAdd");
        System.out.println("Updated Testcase Name = "
                            + this.getName());
    }

    @After
    public void tearDown(){
    }

}
