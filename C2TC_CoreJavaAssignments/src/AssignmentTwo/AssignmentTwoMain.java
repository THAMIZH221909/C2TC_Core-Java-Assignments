package AssignmentTwo;

public class AssignmentTwoMain {
	public static void main(String[] args) {
        // Create Student object (default constructor runs automatically)
        Student s1 = new Student();

        // Create Commission object and use methods
        Commission emp = new Commission();
        emp.acceptDetails();       // input
        emp.calculateCommission(); // calculate + display
    }
}