package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class PlumberParadise extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;

	@Override
	public void create () {
		batch = new SpriteBatch();
		//loads the test image
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 1, 1);
		batch.begin();
		batch.draw(img, 100, 200);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
