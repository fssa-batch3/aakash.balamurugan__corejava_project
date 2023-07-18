package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Practice2 {
	public static void main(String[] args) {
		HashMap<String, List<String>> departmentEmployees = new HashMap<>();

		// Sample input
		String[] in = { "HR-Ram", "HR-Suresh", "IT-Basker", "IT-Joseph", "Admin-Sundar" };

		// Process the input
		for (String i : in) {
			String[] split = i.split("-");
			String department = split[0];
			String employee = split[1];

			// Check if the department already exists in the HashMap
			if (departmentEmployees.containsKey(department)) {
				// If it exists, add the employee to the existing list
				List<String> employees = departmentEmployees.get(department);
				employees.add(employee);
			} else {
				// If it doesn't exist, create a new list with the employee and add it to the
				// HashMap
				List<String> employees = new ArrayList<>();
				employees.add(employee);
				departmentEmployees.put(department, employees);
			}
		}
		System.out.println(departmentEmployees);
	}
}