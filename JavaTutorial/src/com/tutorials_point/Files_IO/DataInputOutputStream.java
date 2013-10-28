package com.tutorials_point.Files_IO;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/29/13
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 * The DataInputStream is used in the context of DataOutputStream and can be
 * used to read primitives datatypes.
 */
public class DataInputOutputStream {

    public static void main(String[] args) throws IOException {
        // create a File object to read from
        File file = new File("C:/EDE/TutorialsPoint/JavaTutorial/hello.txt");

        // create a DataInputStream object to read it from the file
        DataInputStream dataInput = null;
        try {
            dataInput = new DataInputStream(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found: " + file.getName());
        }

        // Create a DataOutputStream object to store the information
        DataOutputStream dataOutput = new DataOutputStream(
                                        new FileOutputStream("output.txt"));

        // read the strings from the file and output into the console
        String input;
        while((input = dataInput.readLine()) != null){
            System.out.println(input);
            // add the input data into the data output stream object
            dataOutput.writeBytes(input);
        }

        // close the files
        dataInput.close();
        dataOutput.close();

    }

}
