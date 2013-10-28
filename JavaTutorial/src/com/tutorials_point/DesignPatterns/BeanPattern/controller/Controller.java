package com.tutorials_point.DesignPatterns.BeanPattern.controller;

import com.tutorials_point.DesignPatterns.BeanPattern.model.Model;
import com.tutorials_point.DesignPatterns.BeanPattern.view.LoginFormEvent;
import com.tutorials_point.DesignPatterns.BeanPattern.view.LoginListener;
import com.tutorials_point.DesignPatterns.BeanPattern.view.View;

public class Controller implements LoginListener {
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
	}
	
	
}
