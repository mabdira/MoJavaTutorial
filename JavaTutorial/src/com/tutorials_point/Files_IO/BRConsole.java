package com.tutorials_point.Files_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/28/13
 * Time: 11:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class BRConsole {
    public static void main(String[] args) throws IOException {
        char c;  // for reading characters from console
        // create a BufferReader object to read input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Ask user to enter input data from the console
        System.out.print("Enter characters, 'q' to quit: ");
        // read characters
        do{
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');

        // read strings
        String s;  // for reading strings from console
        System.out.print("Enter strings, 'q' to quit: ");
        do{
            s = br.readLine();
            System.out.println(s);
        } while(!s.equals("q"));

    }

}
