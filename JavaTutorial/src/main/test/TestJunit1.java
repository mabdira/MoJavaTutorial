package main.test;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestJunit1 extends TestCase{

    @Test
    public void testAdd(){
        // test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        // check for equality
        this.assertEquals("Junit is working fine", str);

        // check for false condition
        this.assertFalse(num > 6);

        // check for not null value
        this.assertNotNull(str);
    }
}
