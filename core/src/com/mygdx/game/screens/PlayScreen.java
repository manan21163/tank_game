package com.mygdx.game.screens;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.Scenes.Hud;

public class PlayScreen implements Screen{
    private SpriteBatch batch;
    private Sprite splash;
    private MyGdxGame game;

    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private Hud hud;
    private TmxMapLoader maploader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    public Texture splashTexture;
    private Texture resumebutton;
    private Music music;
    public Texture getResumebutton() {
        return resumebutton;
    }

    public void setResumebutton(Texture resumebutton) {
        this.resumebutton = resumebutton;
    }

    public PlayScreen(MyGdxGame game){
        this.game=game;
//        music=MyGdxGame.manager.get("intro.wav", Music.class);
//        music.setLooping(true);
//        music.play();
//        gamecam=new OrthographicCamera();
//        gamePort=new StretchViewport(MyGdxGame.V_width,MyGdxGame.V_height,gamecam);
//        hud=new Hud(game.batch);
//
//        maploader=new TmxMapLoader();
//        map=maploader.load("skyonly.tmx");
//        renderer=new OrthogonalTiledMapRenderer(map);
//        gamecam.position.set(gamePort.getWorldWidth()/2,gamePort.getWorldHeight()/2,0);
    }

    @Override
    public void show() {
        setResumebutton(new Texture(Gdx.files.internal("newMananPLay.png")));
//        resumebutton=new Texture(Gdx.files.internal("home.png"));
//        game.setScreen(new screen2(game));
//        batch = new SpriteBatch();

//        splashTexture=new Texture("home.jpg");
//        splash= new Sprite(splashTexture);
//        splash.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
//        game.setScreen(new screen2(game));

    }
//    public void handleInput(){
//
//    }
//    public void update(float dt){
//        handleInput();
//        gamecam.update();
//        renderer.setView(gamecam);
//    }

    @Override
    public void render(float delta) {
//        update(delta);

        if(Gdx.input.getX()>751 && Gdx.input.getX()<1155 && Gdx.input.getY()>656 && Gdx.input.getY()<751){

            if (Gdx.input.justTouched()){
//                System.out.println(Gdx.input.getX()+"x cordinate"+ Gdx.input.getY()+"y cordinate");
                game.setScreen(new screen2(game));
            }
        }

        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(getResumebutton(),0,0,MyGdxGame.V_width,MyGdxGame.V_height);
        game.batch.end();

//        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
//        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
//        gamePort.update(width,height);

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
//        batch.dispose();
//        splash.getTexture().dispose();
    }
}
