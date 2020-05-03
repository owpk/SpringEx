package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("" +
                "applicationcontext.xml");

        //Music testBean = context.getBean("musicBean", Music.class);
        //внедрение зависимости
        //MusicPlayer musicPlayer = new MusicPlayer(testBean);


        //по умолчанию используется singleton
        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //prototype всегда возвращает новый объекта

        //musicPlayer.playMusic();


        //для prototype бинов метод destroy не вызывается
        ClassicalMusic cm = context.getBean("musicBean",ClassicalMusic.class);
        System.out.println(cm.getSong());

        context.close();
    }
}
