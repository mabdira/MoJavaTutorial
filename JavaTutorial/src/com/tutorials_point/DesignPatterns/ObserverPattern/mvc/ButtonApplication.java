package com.tutorials_point.DesignPatterns.ObserverPattern.mvc;

import javax.swing.SwingUtilities;

import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.controller.ButtonController;
import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.model.ButtonModel;
import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.view.ButtonView;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/9/13
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class ButtonApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                runApp();
            }

        });
    }

    public static void runApp() {
        ButtonModel model = new ButtonModel();
        ButtonView view = new ButtonView(model);

        ButtonController controller = new ButtonController(view, model);
    }

}