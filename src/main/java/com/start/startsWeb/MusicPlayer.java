package com.start.startsWeb;

import org.springframework.beans.factory.annotation.Value;

import java.util.Random;
import java.util.List;

public final class MusicPlayer {

    private final List<Music> playlist;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> playlist) {
        this.playlist = playlist;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();

        // output one of the random songs depending on the size of list
        return "Playing: " + this.playlist.get(random.nextInt(playlist.size())).playingMusic()
                + " volume: " + this.volume;
    }
}
