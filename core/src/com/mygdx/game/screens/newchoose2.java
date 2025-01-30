package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyGdxGame;

public class newchoose2 implements Screen {
    private final MyGdxGame game;
    private Texture choose2;

    public Texture getChoose2() {
        return choose2;
    }

    public void setChoose2(Texture choose2) {
        this.choose2 = choose2;
    }

    public newchoose2(MyGdxGame game) {
        this.game = game;
    }


    public void setChoose(Texture choose2) {
        this.choose2 = choose2;
    }
    public Texture getChoose(){
        return choose2;
    }

    @Override
    public void show() {
        setChoose(new Texture(Gdx.files.internal("choose2.png")));
    }

    @Override
    public void render(float delta) {

        if(Gdx.input.getX()>64 && Gdx.input.getX()<590 && Gdx.input.getY()>173 && Gdx.input.getY()<526) {

            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new battlescreen(game));
            }
        }
        if(Gdx.input.getX()>680 && Gdx.input.getX()<1241 && Gdx.input.getY()>133 && Gdx.input.getY()<526) {


            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new battlescreen(game));
            }
        }
        if(Gdx.input.getX()>1301 && Gdx.input.getX()<1875 && Gdx.input.getY()>157 && Gdx.input.getY()<513)
        {
            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new battlescreen(game));
            }
        }
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(getChoose2(),0,0,MyGdxGame.V_width,MyGdxGame.V_height);
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
