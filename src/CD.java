// Kevin Chen, 23365285
import java.util.Date;

public class CD extends MultiMediaItem
{
    private String artist;

    public CD (String id, String title, Date addedOn, Integer playingTime, String artist) {
        super(id, title, addedOn, playingTime); // Inheritance
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
}

