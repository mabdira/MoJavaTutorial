package com.tutorials_point.DesignPatterns.FacadePattern;

/*
 * Facade class!!
 *
 * The Facade pattern in Java is a very simple idea; basically, it means using
 * a class to simplify the usage of other methods and objects.
 */

public class Game {
    // private data variables
	private InputSystem input = new InputSystem();
	private GameObjects objects = new GameObjects();
	private GameConsole screen = new GameConsole();

	public void update() {
		// Input
		input.getInput();

		// Update game objects (player, bad guys, etc)
		objects.update(input);

		// Draw
		screen.draw(objects);
	}
}
