package AssignmentThree.InheritanceComposition;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Item> items;   // Library has-a list of Items

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            if (item instanceof Book) {
                Book b = (Book) item;
                System.out.println("- " + b.title + " by " + b.getAuthor());
            } else if (item instanceof Magazine) {
                Magazine m = (Magazine) item;
                System.out.println("- " + m.title + " Issue " + m.getIssueNumber());
            }
        }
    }

}
