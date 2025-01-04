package svyatoslav_petukhov_oop2;

public class Song {
    private String name;
    private Author author;

    public Song (String name, Author author) {
        this.name = name;
        this.author = author; // Конструктор Song
    }

    public void play() {
        System.out.println("Play song: " + name + ", author: " + author.getName());
        // метод для проигрывания песни
    }
}
