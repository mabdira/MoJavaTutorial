package com.tutorials_point.DesignPatterns.BeanPattern.model;

/**
 * This is a really simple tutorial just on the idea of a “bean” in Java.
 * The bean pattern (although calling it a “pattern” is saying a lot) is very
 * useful as a “transfer object” in the Observer pattern or DAO pattern.
 */

public class Person {
	private int id;
	private String name;
	private String password;
	
	public Person() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
