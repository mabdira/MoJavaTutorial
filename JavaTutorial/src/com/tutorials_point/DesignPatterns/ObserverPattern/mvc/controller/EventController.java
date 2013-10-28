package com.tutorials_point.DesignPatterns.ObserverPattern.mvc.controller;

import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.model.EventModel;
import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.view.EventView;
import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.view.LoginFormEvent;
import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.view.LoginListener;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/10/13
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class EventController implements LoginListener {
    private EventView view;
    private EventModel model;

    public EventController(EventView view, EventModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());

    }


}
