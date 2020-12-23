// Kevin Chen, 23365285
import java.util.*;

public class Database
{
    private ArrayList<Item> item = new ArrayList<Item>();

    public Database (){}

    public void addItem(Item new_item) {
        item.add(new_item);
    }

    public void list() {
        for (int i = 0; i < item.size(); i++) {
            Item display = item.get(i);
            System.out.printf("Item %d:\nID: %s\tTitle: %s\tDate: %tc\n",(i+1),display.getID(),display.getTitle(),display.getAddedOn());
        }
    }

    public ArrayList getItem() {
        return item;
    }
}

