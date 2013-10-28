package main.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 *
 * Junit 4 has introduced a new feature Parameterized tests.Parameterized tests allow developer to run
 * the same test over and over again using different values. There are five steps, that you need to follow
 * to create Parameterized tests.
 *      Annotate test class with @RunWith(Parameterized.class)
 *      Create a public static method annotated with @Parameters that returns a Collection of Objects (as Array) as test data set.
 *      Create a public constructor that takes in what is equivalent to one "row" of test data.
 *      Create an instance variable for each "column" of test data.
 *      Create your tests case(s) using the instance variables as the source of the test data.
 *
 * The test case will be invoked once per each row of data. Let's see Parameterized tests in action.
 *
 */


@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initialize(){
        primeNumberChecker = new PrimeNumberChecker();
    }

    // Each parameter should be placed as argument here
    // Every time runner triggers, will pass the arguments
    // from parameters we defined in primeNumbers() method
    public PrimeNumberCheckerTest(Integer inputNumber, boolean expectedResult){
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers(){
        return Arrays.asList(new Object[][] {
                {2, true},
                {6, false},
                {19, true},
                {22, false},
                {23, true}
        });
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test
    public void testPrimeNumberChecker(){
        System.out.println("Parameterized Number is: " + inputNumber);
        assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }

}
