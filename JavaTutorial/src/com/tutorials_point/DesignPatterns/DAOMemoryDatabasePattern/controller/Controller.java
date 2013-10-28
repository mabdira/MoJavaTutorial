package com.tutorials_point.DesignPatterns.DAOMemoryDatabasePattern.controller;

import com.tutorials_point.DesignPatterns.DAOMemoryDatabasePattern.model.Database;
import com.tutorials_point.DesignPatterns.DAOMemoryDatabasePattern.model.Model;
import com.tutorials_point.DesignPatterns.DAOMemoryDatabasePattern.model.Person;
import com.tutorials_point.DesignPatterns.DAOMemoryDatabasePattern.view.*;

public class Controller implements CreateUserListener, SaveListener,
        AppListener {
	private View view;
	private Model model;

	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void onUserCreated(CreateUserEvent event) {
		model.addPerson(new Person(event.getName(), event.getPassword()));
	}

	@Override
	public void onSave() {
		try {
			model.save();
		} catch (Exception e) {
			view.showError("Error saving to database.");
		}
	}

	@Override
	public void onOpen() {
		try {
			Database.getInstance().connect();
		} catch (Exception e) {
			view.showError("Cannot connect to database.");
		}
		
		try {
			model.load();
		} catch (Exception e) {
			view.showError("Error loading data from database.");
		}
	}

	@Override
	public void onClose() {
		Database.getInstance().disconnect();
	}

}
