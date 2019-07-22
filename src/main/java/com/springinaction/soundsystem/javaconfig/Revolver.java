package com.springinaction.soundsystem.javaconfig;

public class Revolver implements CompactDisc {

    private String title = "-->Revolver";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
