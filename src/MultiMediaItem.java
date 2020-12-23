// Kevin Chen, 23365285
import java.lang.Integer;
import java.util.Date;

public abstract class MultiMediaItem extends Item
{
    private Integer playingTime;

    public MultiMediaItem (String id, String title, Date addedOn, Integer playingTime) {
        super(id, title, addedOn);
        this.playingTime = playingTime;
    }

    public Integer getPlayingTime(){
        return playingTime;
    }
}