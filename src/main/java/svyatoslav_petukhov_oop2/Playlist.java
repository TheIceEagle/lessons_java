package svyatoslav_petukhov_oop2;

import java.util.ArrayList; // импортируем коллекцию ArrayList

public class Playlist {
    private ArrayList<Song> songList; // список песен, который будет хранить объекты класса Song

    public Playlist (){
        songList = new ArrayList<>(); // Конструктор Playlist, Инициализация списка песен
    }

    public void addSong (Song song) {
        songList.add(song); // Метод для добавления песни в список
    }

    public void playAllSongs () {
        for (Song song : songList) {
            song.play(); // Метод для проигрывания всех песен из списка
        }
    }
}
