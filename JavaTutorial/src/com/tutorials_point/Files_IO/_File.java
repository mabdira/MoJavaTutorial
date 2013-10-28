package com.tutorials_point.Files_IO;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/29/13
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 * Java File class represents the files and directory pathnames in an abstract
 * manner. This class is used for creation of files and directories,
 * file searching, file deletion etc.
 */
public class _File {
    public static void main(String[] args){
        String dirname = "C:/EDE/TutorialsPoint/JavaTutorial";
        File file = new File(dirname);

        if(file.isDirectory()){
            System.out.println("Current directory is: " + file.getPath());

            String[] list = file.list();
            for(String fName : list){
                File f = new File(dirname + "/" + fName);
                if(f.isDirectory()){
                    System.out.println(fName + " is a directory");
                }
                else{
                    System.out.println(fName + " is a file");
                }
            }
        }
        else{
            System.out.println(dirname + " is a not a directory");
        }
    }
}
