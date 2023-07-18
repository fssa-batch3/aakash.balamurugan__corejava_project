package day08.practice;

import java.util.*;

public class Practice2 {
	public static void main(String[] args) {
		TreeMap<String, TreeSet<String>> departmentEmployees = new TreeMap<>();

		// Sample input
		String[] in = { "HR,Ram", "HR,Suresh", "IT,Joseph", "IT,Basker", "Admin,Sundar" };

		// Process the input
		for (String i : in) {
			String[] split = i.split(",");
			String department = split[0];
			String employee = split[1];

			// Check if the department already exists in the HashMap
			if (departmentEmployees.containsKey(department)) {
				// If it exists, add the employee to the existing list
				TreeSet<String> employees = departmentEmployees.get(department);
				
				employees.add(employee);
			} else {
				// If it doesn't exist, create a new list with the employee and add it to the
				// HashMap
				TreeSet<String> employees = new TreeSet<>();
				employees.add(employee);
				departmentEmployees.put(department, employees);
			}
		}
		
//		 TreeSet<String> tree_set= new TreeSet<String>();
		Object[] keys = departmentEmployees.keySet().toArray();
//		Object[] values = departmentEmployees.get().toArray();
		for(int i =0;i<keys.length;i++) {
			System.out.print(keys[i]+": ");
			Object[] values = departmentEmployees.get(keys[i]).toArray();
			for (int j = 0; j < values.length; j++) {
				System.out.print(values[i]+", ");
				
			}
			System.out.println();
		}
		
//		System.out.println(departmentEmployees);
	}
}