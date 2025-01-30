package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyGdxGame;

public class battlescreenmenu implements Screen {
    private final MyGdxGame game;
    private Texture tex;

    public Texture getTex() {
        return tex;
    }

    public void setTex(Texture tex) {
        this.tex = tex;
    }

    public battlescreenmenu(MyGdxGame game) {
        this.game = game;
    }

    @Override
    public void show() {
        setTex(new Texture(Gdx.files.internal("battlemenu.png")));
    }

    @Override
    public void render(float delta) {

        if(Gdx.input.getX()>635 && Gdx.input.getX()<1319 && Gdx.input.getY()>333 && Gdx.input.getY()<417) {

            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new battlescreen(game));
            }
        }
        if(Gdx.input.getX()>635 && Gdx.input.getX()<1319 && Gdx.input.getY()>474 && Gdx.input.getY()<554) {

            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new screen3(game));
            }
        }
        if(Gdx.input.getX()>635 && Gdx.input.getX()<1319 && Gdx.input.getY()>611 && Gdx.input.getY()<691)
        {
            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                Gdx.app.exit();
            }
        }
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(getTex(),0,0,MyGdxGame.V_width,MyGdxGame.V_height);
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
