package AssignmentOne;

import AssignmentOne.Employees.*;
import AssignmentOne.Utilities.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager("Priyan", "M101", 80000, "HR");
        Developer developer = new Developer("Selvi", "D202", 60000, "Java");

        // Create Utilities object
        EmployeeUtilities utilities = new EmployeeUtilities();

        System.out.println("BEFORE SALARY INCREMENT");
        utilities.printEmployeeDetails(manager);
        utilities.printEmployeeDetails(developer);

        // Increase salary
        utilities.increaseSalary(manager, 10);
        utilities.increaseSalary(developer, 15);

        System.out.println("\nAFTER SALARY INCREMENT");
        utilities.printEmployeeDetails(manager);
        utilities.printEmployeeDetails(developer);
    }
}