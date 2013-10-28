package com.tutorials_point.DesignPatterns.SingletonPattern.mvc.controller;

import com.tutorials_point.DesignPatterns.SingletonPattern.mvc.model.Model;
import com.tutorials_point.DesignPatterns.SingletonPattern.mvc.view.LoginFormEvent;
import com.tutorials_point.DesignPatterns.SingletonPattern.mvc.view.LoginListener;
import com.tutorials_point.DesignPatterns.SingletonPattern.mvc.view.View;

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
