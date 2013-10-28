package com.tutorials_point.Serialization;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 5:24 PM
 * To change this template use File | Settings | File Templates.
 *
 * The following Deserialize program deserializes the Employee object
 * created in the SerializeEmployee program. Study the program and try to
 * determine its output:
 */
public class DeSerializeEmployee {

    public static void main(String[] args) throws IOException {
        // create fileinputstream to open and read from the file
        InputStream fis = null;
        try {
            fis = new FileInputStream(new File("employee.sar"));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found or cannot be opened: employee.sar");
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        // create object-input-stream for deserializing the employee.sar object
        ObjectInputStream ois = new ObjectInputStream(fis);

        // now deserialize and read the employee.sar object
        Employee emp = null;
        try {
            emp = (Employee) ois.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class to load is not found or cannot be loaded");
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        // close the input streams
        ois.close();
        fis.close();

        // display the data of the object to verify
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + emp.getName());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("SSN: " + emp.getSSN());
        System.out.println("Number: " + emp.getNumber());
    }
}
