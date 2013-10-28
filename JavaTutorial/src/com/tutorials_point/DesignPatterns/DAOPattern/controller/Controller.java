package com.tutorials_point.DesignPatterns.DAOPattern.controller;

import com.tutorials_point.DesignPatterns.DAOPattern.model.DAOFactory;
import com.tutorials_point.DesignPatterns.DAOPattern.model.Model;
import com.tutorials_point.DesignPatterns.DAOPattern.model.Person;
import com.tutorials_point.DesignPatterns.DAOPattern.model.PersonDAO;
import com.tutorials_point.DesignPatterns.DAOPattern.view.CreateUserEvent;
import com.tutorials_point.DesignPatterns.DAOPattern.view.CreateUserListener;
import com.tutorials_point.DesignPatterns.DAOPattern.view.View;

import java.sql.SQLException;

public class Controller implements CreateUserListener {
	private View view;
	private Model model;
	
	private PersonDAO personDAO = DAOFactory.getPersonDAO();
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
		try {
			personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
