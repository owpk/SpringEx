package org.example.springcourse;

public class Song {
    private Music music;
    private String name;
    private int volume;
    @Override
    public String toString() {
        return "Song : " + music.getSong() +
                "\nVolume : " +
                volume + "\nName : " + name;
    }
    public Song() {
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

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
}
