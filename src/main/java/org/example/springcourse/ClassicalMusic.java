package org.example.springcourse;

public class ClassicalMusic implements Music {
    public String getGenre() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
