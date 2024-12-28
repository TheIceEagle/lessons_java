package org.jusan.week2.oop2.lesson.HomeWorkSarbasAidos;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Чайковский");
        Author author2 = new Author("Вивальди");
        Author author3 = new Author("Киркоров");
        Author author4 = new Author("Sting");
        Author author5 = new Author("Queen");

        // Создаем песни
        Song song1 = new Song("Щелкунчик", author1);
        Song song2 = new Song("Лебединое озеро", author1);
        Song song3 = new Song("Времена года", author2);
        Song song4 = new Song("Цвет настроения синий", author3);
        Song song5 = new Song("Shape of My Heart", author4);
        Song song6 = new Song("Show must go on", author5);
        Song song7 = new Song("We will rock you", author5);

        // Создаем плейлист
        PlayList playlist = new PlayList();

        // Добавляем песни в плейлист
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        playlist.addSong(song6);
        playlist.addSong(song7);

        // Проигрываем все песни
        System.out.println("== Проигрываем все песни из плейлиста ==");
        playlist.playAllSongs();
    }
}
