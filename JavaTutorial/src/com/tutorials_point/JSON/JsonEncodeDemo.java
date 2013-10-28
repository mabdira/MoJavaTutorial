package com.tutorials_point.JSON;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 8/1/13
 * Time: 5:29 PM
 * To change this template use File | Settings | File Templates.
 *
 * Following is a simple example to encode a JSON object using Java JSONObject
 * which is a subclass of java.util.HashMap. No ordering is provided. If you need
 * strict ordering of elements use JSONValue.toJSONString( map ) method with ordered
 * map implementation such as java.util.LinkedHashMap.
 */
public class JsonEncodeDemo {
    public static void main(String[] args){
        // create a json object
        JSONObject jsonObject = new JSONObject();

        // put the data into the json object
        jsonObject.put("name", "foo");
        jsonObject.put("num", new Integer(100));
        jsonObject.put("balance", new Double(1000.21));
        jsonObject.put("is_vip", new Boolean(true));
        jsonObject.put("number", 5);

        // put the data of the jsonObject into a Writer object and display it
        Writer out = new StringWriter();
        try {
            jsonObject.writeJSONString(out);
        } catch (IOException e) {
            System.out.println("Not able to write JSON String into Writer object");
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        // display the data using jsonObject.toString() method
        System.out.println("Output data using jsonObject.toString() -> "
                           + jsonObject);

        // display the data using the writer object
        String jsonText = out.toString();
        System.out.println("\nOutput data using Writer object -> "
                            + jsonText);

    }
}
