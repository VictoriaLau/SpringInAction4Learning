package com.springinaction.soundsystem.javaconfig;

public class HardDaysNight implements CompactDisc {

    private String title = "-->Hard Days Night";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
