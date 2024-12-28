package org.jusan.week2.oop2.lesson.HomeWorkSarbasAidos;

public class Song {
    private String name;
    private Author author;

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public void play(){
        System.out.println("Играет песня: " + name + ", автор: " + author);
    }
}
