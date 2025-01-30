package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyGdxGame;

public class resumescreen implements Screen {
    MyGdxGame game;
    private Texture res_screen;
    public Texture getRes_screen(){
        return res_screen;
    }
    public void setRes_screen(Texture res_screen) {
        this.res_screen = res_screen;
    }

    public resumescreen(MyGdxGame game){
        this.game=game;
    }
    @Override
    public void show() {
        setRes_screen(new Texture(Gdx.files.internal("savegame.png")));
    }

    @Override
    public void render(float delta) {
        if(Gdx.input.getX()>13 && Gdx.input.getX()<144 && Gdx.input.getY()>3 && Gdx.input.getY()<93) {
            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new screen2(game));
            }
        }
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(getRes_screen(),0,0,MyGdxGame.V_width,MyGdxGame.V_height);
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
