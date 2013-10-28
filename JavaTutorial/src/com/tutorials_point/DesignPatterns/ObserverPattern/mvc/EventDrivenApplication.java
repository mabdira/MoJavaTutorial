package com.tutorials_point.DesignPatterns.ObserverPattern.mvc;

import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.controller.EventController;
import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.model.EventModel;
import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.view.EventView;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/10/13
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class EventDrivenApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                runApp();
            }

        });
    }

    public static void runApp() {
        EventModel model = new EventModel();
        EventView view = new EventView(model);

        EventController controller = new EventController(view, model);

        view.setLoginListener(controller);
    }

}
