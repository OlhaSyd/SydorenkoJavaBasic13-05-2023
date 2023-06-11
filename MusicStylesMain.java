package com.sydorenko;

public class MusicStylesMain {
    public static void main(String[] args) {
        MusicStyles popMusicGroup = new PopMusic();
        MusicStyles classicMusicGroup = new ClassicMusic();
        MusicStyles rockMusicGroup = new RockMusic();
        MusicStyles[] musicGroups = {popMusicGroup, classicMusicGroup, rockMusicGroup};
        for (MusicStyles play : musicGroups) {

            play.playMusic();
        }
    }
}