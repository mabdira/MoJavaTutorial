package com.tutorials_point.Files_IO;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/29/13
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        File helloFile = new File("C:/EDE/TutorialsPoint/JavaTutorial/hello.txt");
        File outputFile = new File("C:/EDE/TutorialsPoint/JavaTutorial/output.txt");
        // create a buffered reader object for reading the hello.txt file
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(helloFile));
        } catch (FileNotFoundException e) {
            System.out.println("File not found or cannot read it: " + helloFile.getName());
        }
        // create a buffered writer object for writing outputs
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(outputFile));
        } catch (IOException e) {
            System.out.println("IOException thrown when creating the BufferedWriter object: "
                                + outputFile.getName());
        }

        // read each line and display
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
            // write it to the buffered writer file
            bw.write(line);
            bw.newLine();
        }

        // close the files
        br.close();
        bw.close();

    }
}
