package AssignmentThree.InheritanceComposition;

public class InheritanceComposition {
	public static void main(String[] args) {
        //Inheritance
        Book book1 = new Book(101, "Java Basics", "James Gosling");
        Magazine mag1 = new Magazine(201, "Tech Today", 45);

        book1.displayInfo();  
        mag1.displayInfo();   

        //Composition
        Library library = new Library();
        library.addItem(book1);
        library.addItem(mag1);

        library.showAllItems();
    }

}
