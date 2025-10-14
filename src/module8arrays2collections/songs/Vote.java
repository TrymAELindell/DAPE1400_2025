package module8arrays2collections.songs;

public class Vote {
    // Let's make these private to ensure encapsulation
    private String songTitle;
    private String artist;
    private double score;

    /*
    The constructor.
    To be able to create a Vote object, you have to provide songTitle, artist and score.
     */
    public Vote(String songTitle, String artist, double score) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.score = score;
    }
    // Three getters, one for each attribute.
    public String getSongTitle() {
        return songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public double getScore() {
        return score;
    }

    /**
     * A method printing (SOUT) all info regarding the attributes in the object.
     */
    public void printInfo(){
        System.out.println("Songtitle:"
                + songTitle
                + ", Artist:"+artist
                + ", Score:"+score);
    }

}
