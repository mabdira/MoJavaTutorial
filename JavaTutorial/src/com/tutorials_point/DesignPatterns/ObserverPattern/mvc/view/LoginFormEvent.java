package com.tutorials_point.DesignPatterns.ObserverPattern.mvc.view;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/10/13
 * Time: 3:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginFormEvent {
    // private data variables
    private final String name;
    private final String password;

    public LoginFormEvent(final String name, final String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
