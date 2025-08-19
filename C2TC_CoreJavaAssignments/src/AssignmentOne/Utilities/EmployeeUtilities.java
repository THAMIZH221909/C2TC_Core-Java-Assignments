package AssignmentOne.Utilities;

import AssignmentOne.Employees.Employee;

public class EmployeeUtilities {
    public void increaseSalary(Employee emp, double percentage) {
    	
    	double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary);
        System.out.println("Salary increased for " + emp.getName() + ". New Salary: " + emp.getSalary());
    }
    public void printEmployeeDetails(Employee emp) {
        emp.displayInfo();
    }
}