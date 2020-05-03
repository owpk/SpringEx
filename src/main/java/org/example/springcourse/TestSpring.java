package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("" +
                "applicationcontext.xml");

        //Music testBean = context.getBean("musicBean", Music.class);
        //внедрение зависимости
        //MusicPlayer musicPlayer = new MusicPlayer(testBean);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
