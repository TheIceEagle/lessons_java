package org.jusan.week2.oop2.lesson.HomeWorkSarbasAidos;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("����������");
        Author author2 = new Author("��������");
        Author author3 = new Author("��������");
        Author author4 = new Author("Sting");
        Author author5 = new Author("Queen");

        // ������� �����
        Song song1 = new Song("���������", author1);
        Song song2 = new Song("��������� �����", author1);
        Song song3 = new Song("������� ����", author2);
        Song song4 = new Song("���� ���������� �����", author3);
        Song song5 = new Song("Shape of My Heart", author4);
        Song song6 = new Song("Show must go on", author5);
        Song song7 = new Song("We will rock you", author5);

        // ������� ��������
        PlayList playlist = new PlayList();

        // ��������� ����� � ��������
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        playlist.addSong(song6);
        playlist.addSong(song7);

        // ����������� ��� �����
        System.out.println("== ����������� ��� ����� �� ��������� ==");
        playlist.playAllSongs();
    }
}
