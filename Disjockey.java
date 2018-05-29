package com.stepwisedesign;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;


public class Disjockey {
    /*
    SongsOfThe70s songsOfThe70s;
    SongsOfThe80s songsOfThe80s;
    SongsOfThe90s songsOfThe90s;
    */
    SongIterator songsOfThe70s;
    SongIterator songsOfThe80s;
    SongIterator songsOfThe90s;

    //public Disjockey(SongsOfThe70s songsOfThe70, SongsOfThe80s songsOfThe80s, SongsOfThe90s songsOfThe90s){
    public Disjockey(SongIterator songsOfThe70s, SongIterator songsOfThe80s,SongIterator songsOfThe90s){


        this.songsOfThe70s = songsOfThe70s;
        this.songsOfThe80s = songsOfThe80s;
        this.songsOfThe90s = songsOfThe90s;

    }
    /*
    public void showTheSongs(){

        ArrayList aL70sSongs = songsOfThe70s.getBestSongs();

        System.out.println("Songs of the 70s\n");

        for(int i = 0; i < aL70sSongs.size(); i++){

            SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }


        SongInfo[] aL80sSongs = songsOfThe80s.getBestSongs();

        System.out.println("Songs of the 80s\n");

        for(int i = 0; i < aL80sSongs.length; i++){

            SongInfo bestSongs = aL80sSongs[i];

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }

        Hashtable<Integer, SongInfo> ht90sSongs = songsOfThe90s.getBestSongs();

        System.out.println("Songs of the 90s\n");

        for(Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();){


            SongInfo bestSongs = ht90sSongs.get(e.nextElement());

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }
    }
    */
    public void showTheSongs2(){
        Iterator songs70s = songsOfThe70s.createIterator();
        Iterator songs80s = songsOfThe80s.createIterator();
        Iterator songs90s = songsOfThe90s.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(songs70s);
        printTheSongs(songs80s);
        printTheSongs(songs90s);
    }

    public void printTheSongs(Iterator iterator){

        while (iterator.hasNext()){
            //System.out.println(songs.next());
            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }
}
