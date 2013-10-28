package com.tutorials_point.Files_IO;

import java.io.*;


/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/29/13
 * Time: 12:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class FileInputOutputStream {
    public static void main(String[] args) throws IOException {
        // create a file object
        File file = new File("C:/EDE/TutorialsPoint/JavaTutorial/hello.txt");
        // create a file input stream
        InputStream fis = new FileInputStream(file);
        // create a file output stread
        OutputStream fos = new FileOutputStream(
                     new File("C:/EDE/TutorialsPoint/JavaTutorial/output.txt"));
        // count the number of bytes in the file that can be read
        int numBytes = fis.available();
        System.out.println("Number of bytes that can be read: " + numBytes);
        // read each line of the file and display it to the console
        int read;
        int count = 0;
        while((read = fis.read()) != -1){
            System.out.println((char) read);
            // write it out to file output stream as well
            fos.write(read);
            count++;
        }

        System.out.println("Total number of words: " + count);
        // close the files
        fis.close();
        fos.close();
    }
}
