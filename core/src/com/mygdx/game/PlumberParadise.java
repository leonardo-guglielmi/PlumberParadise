package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlumberParadise extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private Player player;

	@Override
	public void create () {
		batch = new SpriteBatch();

		//loads the test image
		img = new Texture("badlogic.jpg");

		//create player
		player = new Player(img);
	}

	@Override
	public void render () {
		//ScreenUtils.clear(0, 0, 1, 1);
		batch.begin();

		// test for pressed-key listener
		batch.draw(player.getTexture(), player.getPosX(), player.getPosY());
		Gdx.input.setInputProcessor(player);
		batch.draw(player.getTexture(), player.getPosX(), player.getPosY());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
