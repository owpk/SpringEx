package org.example.springcourse;

public class ClassicalMusic implements Music {
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Classical music Initialization...");
    }
    public void doMyDestroy() {
        System.out.println("Doing classicalMusic destruction...");
    }

    private ClassicalMusic(){

    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
