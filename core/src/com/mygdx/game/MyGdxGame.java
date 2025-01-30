package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.PlayScreen;
public class MyGdxGame extends Game {
	public static final int V_width=1920;
	public static final int V_height=1080;

	public SpriteBatch batch;
	public static AssetManager manager;


	@Override
	public void create () {

		batch = new SpriteBatch();

		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
