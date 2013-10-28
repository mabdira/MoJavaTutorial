package com.tutorials_point.Files_IO;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/29/13
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 *
 * The ByteArrayInputStream and ByteArrayOutputStream class allows a buffer in the memory to be used as an
 * InputStream and OutputStream. Both the input and output source is a byte array.
 */
public class ByteArrayInputOutputStream {

        public static void main(String args[])throws IOException {
            // create byte array output stream object
            ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);

            while( bOutput.size()!= 10 ) {
                // Gets the inputs from the user
                bOutput.write(System.in.read());
            }

            byte b [] = bOutput.toByteArray();
            System.out.println("Print the content");
            for(int x= 0 ; x < b.length; x++) {
                // printing the characters
                System.out.print((char)b[x]  + "   ");
            }
            System.out.println("   ");

            int c;
            // create byte array input stream object
            InputStream bInput = new ByteArrayInputStream(b);

            System.out.println("Converting characters to Upper case " );
            for(int y = 0 ; y < 1; y++ ) {
                while(( c= bInput.read())!= -1) {
                    System.out.println(Character.toUpperCase((char)c));
                }
                bInput.reset();
            }
        }
}
