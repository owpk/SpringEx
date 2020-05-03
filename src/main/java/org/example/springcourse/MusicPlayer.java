package org.example.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Song> musicList = new ArrayList<>();

    //IoC (Inversion of control)
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer(){

    }

    public void setMusic(List<Song> songs) {
        this.musicList = songs;
    }

    public void playMusic() {
        musicList.forEach(System.out::println);
    }
}
