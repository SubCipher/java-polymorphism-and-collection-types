package com.stepwisedesign;

public class RadioStation {

    public static void main(String[] args) {


        SongsOfThe70s songsOfThe70s=  new SongsOfThe70s();
        SongsOfThe80s songsOfThe80s = new SongsOfThe80s();
        SongsOfThe90s songsOfThe90s = new SongsOfThe90s();


        Disjockey madME = new Disjockey (songsOfThe70s,songsOfThe80s,songsOfThe90s);

        madME.showTheSongs2();
    }


}
