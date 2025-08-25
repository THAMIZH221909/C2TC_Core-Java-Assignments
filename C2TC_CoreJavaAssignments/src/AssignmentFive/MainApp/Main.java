package AssignmentFive.MainApp;

import AssignmentFive.MyPack.Book;
import AssignmentFive.MyPack.Magazine;

public class Main {
	public static void main(String[] args) {
	    Book b1 = new Book(101, "Java Programming", "James Gosling");
	    Magazine m1 = new Magazine(201, "Tech Monthly", 45);

	    System.out.println("=== Book Details ===");
	    b1.displayInfo();

	    System.out.println("\n=== Magazine Details ===");
	    m1.displayInfo();
	}
}