package com.start.startsWeb.typeMusic;

import com.start.startsWeb.Music;


public class ClassicMusic implements Music {

    @Override
    public String playingMusic() {

        return "Eine kleine Nachtmusik";
    }
}
