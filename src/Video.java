// Kevin Chen, 23365285
import java.util.Date;
public class Video extends MultiMediaItem
{
    private String director;

    public Video (String id, String title, Date addedOn, Integer playingTime, String director) {
        super(id, title, addedOn, playingTime);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}