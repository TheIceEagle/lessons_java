package svyatoslav_petukhov_oop2;

public class MainSong {
    public static void main(String[] Args) {

        // создаём авторов
        Author Eminem = new Author("Eminem");
        Author KanyeWest = new Author("Kanye West");

        // создаём песни
        Song eminem1 = new Song("Mockingbird", Eminem);
        Song eminem2 = new Song("Superman", Eminem);
        Song eminem3 = new Song("The Real Slim Shady", Eminem);
        Song KanyeWest1 = new Song("Why I Love You", KanyeWest);
        Song KanyeWest2 = new Song("CARNIVAL", KanyeWest);
        Song KanyeWest3 = new Song("Stronger", KanyeWest);

        // создаём плейлист
        Playlist RapHits = new Playlist();

        // добавляем песни в плейлист
        RapHits.addSong (eminem1);
        RapHits.addSong (eminem2);
        RapHits.addSong (eminem3);
        RapHits.addSong (KanyeWest1);
        RapHits.addSong (KanyeWest2);
        RapHits.addSong (KanyeWest3);

        // проигрываем все песни
        RapHits.playAllSongs();


    }
}
