package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.PlumberParadise;

// todo: discover how suppress obsolete warnings (suggest to use -Xlint: -options)
public class DesktopLauncher {
	public static void main (String[] arg) {
		// creating configuration for the game window
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setIdleFPS(30);
		config.setTitle("Plumber Paradise");
		config.setMaximized(true);
		config.setWindowIcon("plumberParadiseLogo.png");

		//starting window application
		new Lwjgl3Application(new PlumberParadise(), config);
	}
}
