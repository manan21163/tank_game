package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyGdxGame;

public class battlescreen implements Screen {
    private final MyGdxGame game;
    private Texture choose1;

    public void setChoose1(Texture choose1) {
        this.choose1 = choose1;
    }
    public Texture getChoose1(){
        return choose1;
    }
    public battlescreen(MyGdxGame game) {
        this.game = game;
    }
    @Override
    public void show() {
        setChoose1(new Texture(Gdx.files.internal("battle1.png")));
    }

    @Override
    public void render(float delta) {

        if(Gdx.input.getX()>12 && Gdx.input.getX()<191 && Gdx.input.getY()>0 && Gdx.input.getY()<148) {
//        if(Gdx.input.getX()>0) {
            if (Gdx.input.justTouched()){
                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new battlescreenmenu(game));
            }
        }
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(getChoose1(),0,0,MyGdxGame.V_width,MyGdxGame.V_height);
        game.batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
