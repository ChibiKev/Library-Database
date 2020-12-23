// Kevin Chen, 23365285
import java.util.Date;

public class Textbook extends Item
{
    private String author;

    public Textbook (String id, String title, Date addedOn, String author){
        super(id, title, addedOn);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}