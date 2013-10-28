package com.tutorials_point.Serialization;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 *
 * The ObjectOutputStream class is used to serialize an Object. The
 * following SerializeDemo program instantiates an Employee object and
 * serializes it to a file.
 *
 * When the program is done executing, a file named employee.ser is created.
 * The program does not generate any output, but study the code and try to
 * determine what the program is doing.
 *
 * Note: When serializing an object to a file, the standard convention in
 * Java is to give the file a .ser extension.
 */
public class SerializeEmployee {

    public static void main(String[] args) throws IOException {
        // Create an employee object to serialize
        Employee emp = new Employee("Mohammad Abdirashid", "14 Roy Lane, Highland, NY 12528",
                                    456783485, 730197);
        // Create a file input stream to persist the employee object data
        OutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("employee.sar"));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found or cannot be opened: " + "employee.sar");
            e.printStackTrace();
        }

        // Create ObjectOutputStream to serialize the employee object
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Write the employee object into the output stream for persistent
        oos.writeObject(emp);

        // close the output streams
        oos.close();
        fos.close();

        // Done serializing the object to persistent file
        System.out.println("Done serializing the employee object to file: "
                            + "employee.sar");
    }
}
