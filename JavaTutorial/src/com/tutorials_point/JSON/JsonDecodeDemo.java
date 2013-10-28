package com.tutorials_point.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 8/1/13
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 *
 * Following example makes use of JSONObject and JSONArray where JSONObject is a
 * java.util.Map and JSONArray is a java.util.List, so you can access them with
 * standard operations of Map or List.
 */
public class JsonDecodeDemo {
    public static void main(String[] args) {
        try{

            // declare a json parser object
            JSONParser jsonParser = new JSONParser();
            // json array
            String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
            Object obj = jsonParser.parse(s);
            JSONArray jsonArray = (JSONArray) obj;
            System.out.println("The 2nd element of array");
            System.out.println(jsonArray.get(1));
            System.out.println();

            JSONObject obj2 = (JSONObject) jsonArray.get(1);
            System.out.println("Field \"1\"");
            System.out.println(obj2.get("1"));

            s = "{}";
            obj = jsonParser.parse(s);
            System.out.println("\n" + obj);

            s = "[5,]";
            obj = jsonParser.parse(s);
            System.out.println("\n" + obj);

            s = "[5,,2]";
            obj = jsonParser.parse(s);
            System.out.println("\n" + obj);
        } catch (ParseException pe){
            System.out.println("Position: " + pe.getPosition());
            System.out.println(pe);
        }

    }
}
