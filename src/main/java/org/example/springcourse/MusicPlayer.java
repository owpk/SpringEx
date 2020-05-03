package org.example.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    //IoC (Inversion of control)
    public MusicPlayer(Music music) {
        this.music = music;
    }


    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(music.getSong());
    }
}
