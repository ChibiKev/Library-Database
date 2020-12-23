// Kevin Chen, 23365285
import java.util.Date;

public abstract class Item implements Comparable<Item>
{
    private String id;
    private String title;
    private Date addedOn;

    public Item (String id, String title, Date addedOn){
        this.id = id;
        this.title = title;
        this.addedOn = addedOn;
    }

    public String getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getAddedOn() {
        return addedOn;
    }

    public int compareTo(Item newItem) {
        if (this.equals(newItem))
            return 1;
        else
            return -1;
    }

}
