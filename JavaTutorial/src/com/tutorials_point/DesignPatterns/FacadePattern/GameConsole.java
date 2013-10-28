package com.tutorials_point.DesignPatterns.FacadePattern;

/*
 * Dummy implementation
 */
public class GameConsole {
	public void clearScreen() {
		System.out.println("Clearing screen ....");
	}
	
	public void draw(GameObjects objects) {
		System.out.println("Drawing ....");
	}
}
