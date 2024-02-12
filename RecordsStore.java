public class RecordsStore {
    public static void main(String[] args) {
        MusicRecord musicRecord1 = new MusicRecord();

        musicRecord1.setGenre("rock");
        musicRecord1.setArtist("Pink Floyd");
        musicRecord1.setAlbumName("Wish you were here");

        MusicRecord musicRecord2 = new MusicRecord();
        musicRecord2.setGenre("pop");
        musicRecord2.setArtist("Michael Jackson");
        musicRecord2.setAlbumName("Thriller");
    }
}