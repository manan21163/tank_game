package com.mygdx.game.sound;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class soundex extends ApplicationAdapter {
    Sound sound;
    public void create(){
        sound= Gdx.audio.newSound(Gdx.files.internal("soundex.wav"));
        sound.play(1.0f,1.0f,1.0f);



    }
}
