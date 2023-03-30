package com.start.startsWeb;

import com.start.startsWeb.config.Config;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StartsWebApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);

		MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(player.playMusic());

		System.out.println(player.getVolume());

        context.close();
	}
}
