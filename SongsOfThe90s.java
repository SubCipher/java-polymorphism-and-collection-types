package com.stepwisedesign;
import java.util.Hashtable;
import java.util.Iterator;


public class SongsOfThe90s implements SongIterator {


    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();
    int hashKey = 0;


    public SongsOfThe90s(){

        addSong("C.R.E.A.M", "Wu Tang Clan",1991);
        addSong("", "All Eyes On Me", 1995);
        addSong("X Gonna Give It To Ya", "DMX", 1996);
    }

    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName,bandName,yearReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }
    /*
    public Hashtable<Integer, SongInfo> getBestSongs() {
        return bestSongs;
    }
    */
    @Override
    public Iterator createIterator(){
        return bestSongs.values().iterator();
    }
}
