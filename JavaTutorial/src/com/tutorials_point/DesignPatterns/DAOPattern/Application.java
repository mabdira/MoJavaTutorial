package com.tutorials_point.DesignPatterns.DAOPattern;

import com.tutorials_point.DesignPatterns.DAOPattern.controller.Controller;
import com.tutorials_point.DesignPatterns.DAOPattern.model.Model;
import com.tutorials_point.DesignPatterns.DAOPattern.view.View;

import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                runApp();
            }

        });
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);
		
		view.setLoginListener(controller);
	}

}
