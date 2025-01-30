package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyGdxGame;

public class screen2 implements Screen {
    private final MyGdxGame game;
    private Texture newplayButtonActive;
//    Texture newplayButtonInactive;
//    Texture resumeplayButtonActive;
//    Texture resumeplayButtonInactive;
//    Texture exitButtonActive;
//    Texture exitButtonInactive;
    private static final int EXIT_BUTTON_Y=100;
    public Texture getNewplayButtonActive(){
        return newplayButtonActive;
    }
    public void setnewplayButtonActive(Texture newplayButtonActive){
        this.newplayButtonActive=newplayButtonActive;
    }
    public screen2(MyGdxGame game){
        this.game=game;
//        newplayButtonActive=new Texture("a.png");
//        newplayButtonInactive=new Texture("a.png");
//        resumeplayButtonActive=new Texture("a.png");
//        resumeplayButtonInactive=new Texture("a.png");
//        exitButtonActive=new Texture("a.png");
//        exitButtonInactive=new Texture("a.png");
    }
    @Override
    public void show() {
//        game.setScreen(new screen3(game));
        setnewplayButtonActive(new Texture(Gdx.files.internal("a.png")));
    }

    @Override
    public void render(float delta) {


        if(Gdx.input.getX()>1159 && Gdx.input.getX()<1723 && Gdx.input.getY()>243 && Gdx.input.getY()<360) {
            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new screen3(game));
            }
        }
        if(Gdx.input.getX()>1162 && Gdx.input.getX()<1723 && Gdx.input.getY()>405 && Gdx.input.getY()<536) {

            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new resumescreen(game));
            }
        }
        if(Gdx.input.getX()>1162 && Gdx.input.getX()<1727 && Gdx.input.getY()>602 && Gdx.input.getY()<721) {
            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                Gdx.app.exit();
            }
        }
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(getNewplayButtonActive(), 0, 0, MyGdxGame.V_width , MyGdxGame.V_height);
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
