package com.mygdx.game.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import java.awt.*;

public class Hud {
    public Stage stage;
    private Viewport viewport;

    private Integer score;
    private float change_angle;
    private Integer change_power;

    com.badlogic.gdx.scenes.scene2d.ui.Label scoreLabel;
    Label change_angleLabel;
    Label change_powerLabel;
    Label score_Label;

    public Hud(SpriteBatch sb){
        score=0;
        change_angle=0;
        change_power=0;

        viewport=new FitViewport(MyGdxGame.V_width,MyGdxGame.V_height,new OrthographicCamera());
        stage=new Stage(viewport, sb);

        Table table=new Table();
        table.top();
        table.setFillParent(true);

        score_Label=new Label("SCORE",new Label.LabelStyle(new BitmapFont(),Color.WHITE));
        scoreLabel=new Label(String.format("%6d",score),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        change_angleLabel=new Label("ANGLE",new Label.LabelStyle(new BitmapFont(),Color.WHITE));
        change_powerLabel=new Label("POWER ",new Label.LabelStyle(new BitmapFont(),Color.WHITE));

        table.add(change_angleLabel).expandX().padTop(10);
        table.add(change_powerLabel).expandX().padTop(10);
        table.add(score_Label).expandX().padTop(10);
        table.row();
//        table.add()
        stage.addActor(table);
    }

}
