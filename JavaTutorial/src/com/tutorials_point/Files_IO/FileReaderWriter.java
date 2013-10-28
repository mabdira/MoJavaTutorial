package com.tutorials_point.Files_IO;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/29/13
 * Time: 5:39 PM
 * To change this template use File | Settings | File Templates.
 * This class inherits from the InputStreamReader class. FileReader is used for
 * reading streams of characters.
 */
public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        File helloFile = new File("C:/EDE/TutorialsPoint/JavaTutorial/hello.txt");
        File outputFile = new File("C:/EDE/TutorialsPoint/JavaTutorial/output.txt");
        // open the file for reading
        FileReader reader = null;
        // create a file writer class for output
        FileWriter writer = new FileWriter(outputFile);
        try {
            reader = new FileReader(helloFile);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found or cannot be opened: "
                                + helloFile.getName());
        }
        // read all the lines in the file and display it in the console
        int c;
        while((c = reader.read()) != -1){
            char ch = (char) c;
            System.out.println(ch);
            // write it output.txt file
            writer.write(ch);
        }

        // close the file
        reader.close();
        writer.close();
    }
}
