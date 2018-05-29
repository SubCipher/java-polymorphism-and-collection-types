package com.stepwisedesign;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class SongsOfThe80s implements SongIterator{


    SongInfo[] bestSongs;
    int arrayVale = 0;


    public SongsOfThe80s(){

        bestSongs = new SongInfo[3];

        addSong("Living On A Prayer", "Bon Jovi",1986);
        addSong("", "Purple Rain", 1985);
        addSong("King Of Rock", "Run DMC", 1983);
    }

    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName,bandName,yearReleased);
        bestSongs[arrayVale] = songInfo;
        arrayVale++;
    }
/*
    public SongInfo[] getBestSongs(){
        return bestSongs;
    }
    */
    @Override
    public Iterator createIterator(){
        return Arrays.asList(bestSongs).iterator();
    }
}
