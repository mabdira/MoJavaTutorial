package com.tutorials_point;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/12/13
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class MessageUtil {
    private String message;

    // Constructor
    // @param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
