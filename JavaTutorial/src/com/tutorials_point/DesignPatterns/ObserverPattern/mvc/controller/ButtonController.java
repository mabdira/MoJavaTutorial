package com.tutorials_point.DesignPatterns.ObserverPattern.mvc.controller;

import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.model.ButtonModel;
import com.tutorials_point.DesignPatterns.ObserverPattern.mvc.view.ButtonView;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/9/13
 * Time: 8:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ButtonController {
    // private data variables
    private ButtonView view;
    private ButtonModel model;

    public ButtonController(ButtonView view, ButtonModel model) {
        this.view = view;
        this.model = model;
    }

}
