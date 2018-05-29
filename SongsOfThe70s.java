package com.stepwisedesign;
import java.util.ArrayList;
import java.util.Iterator;


public class SongsOfThe70s implements SongIterator{

    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s(){

        bestSongs = new ArrayList<SongInfo>();

        addSong("Imagine", "John Lennon",1971);
        addSong("American Pic", "Dan McLean", 1971);
        addSong("I will Servive", "Gloria Ganyor", 1979);
    }

    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName,bandName,yearReleased);
        bestSongs.add(songInfo);
    }
/*
    public ArrayList<SongInfo> getBestSongs(){
        return bestSongs;
    }
*/
    @Override
    public Iterator createIterator(){

        return bestSongs.iterator();
    }


}
