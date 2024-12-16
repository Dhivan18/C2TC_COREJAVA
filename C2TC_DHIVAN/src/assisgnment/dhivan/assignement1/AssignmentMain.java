package com.dhivan.assignement1;

import com.dhivan.assignment.employees.Developer;
import com.dhivan.assignment.employees.Manager;
import com.dhivan.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Manager manager = new Manager("John", 101, 90000, "Sales"); 
	        Developer developer = new Developer("Alice", 102, 80000, "Java"); 
	        EmployeeUtilities.printEmployeeDetails(manager); 
	        EmployeeUtilities.printEmployeeDetails(developer);
	}

}
