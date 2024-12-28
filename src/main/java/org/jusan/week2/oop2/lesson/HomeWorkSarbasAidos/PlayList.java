package org.jusan.week2.oop2.lesson.HomeWorkSarbasAidos;
import java.util.ArrayList;

public class PlayList {

    private ArrayList<Song> songList = new ArrayList<Song>();


    public void addSong(Song song){
        songList.add(song);
    }

    public void playAllSongs(){
        for (Song songs : songList){
            songs.play();
        }
    }
}
