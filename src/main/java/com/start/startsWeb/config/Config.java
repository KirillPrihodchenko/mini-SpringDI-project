package com.start.startsWeb.config;

import com.start.startsWeb.*;
import com.start.startsWeb.typeMusic.ClassicMusic;
import com.start.startsWeb.typeMusic.PopMusic;
import com.start.startsWeb.typeMusic.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    public ClassicMusic classicMusic() {
        return new ClassicMusic();
    }
    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public List<Music> playlistMusic() {
        return Arrays.asList(classicMusic(), popMusic(), rockMusic());
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(playlistMusic());
    }
}
