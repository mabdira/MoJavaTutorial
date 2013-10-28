package main.test;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/12/13
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 */

import com.tutorials_point.MessageUtil;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        assertEquals(message, messageUtil.printMessage());
    }
}
