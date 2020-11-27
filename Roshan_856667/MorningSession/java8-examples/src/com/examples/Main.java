package com.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("1. Add");
//		System.out.println("2. Display ID");
//		System.out.println("3. Display All");
//		System.out.println("4. Sort by ID");
//		System.out.println("5. Sort by DOB");
//		System.out.println("6. Sort by Salary");
//		System.out.println("7. Sort by Name");
//		System.out.println("8. Exit");
//		int input = s.nextInt();
		int input = 0;
		do {
			System.out.println("1. Add");
			System.out.println("2. Display ID");
			System.out.println("3. Display All");
			System.out.println("4. Sort by ID");
			System.out.println("5. Sort by DOB");
			System.out.println("6. Sort by Salary");
			System.out.println("7. Sort by Name");
			System.out.println("8. Exit");
			System.out.println("Enter your option : ");
			input = s.nextInt();
			EmployeeService service = new EmployeeService();
			List<Employee> list = new ArrayList<Employee>();
			list = service.getEmployees();
			switch(input){
				case 1:
					int id = s.nextInt();
					System.out.println(id);
					s.nextLine();
					String name = s.nextLine();
					System.out.println(name);
					double salary = s.nextDouble();
					s.nextLine();
					System.out.println(salary);
					String date = s.nextLine();
					LocalDate dob = LocalDate.parse(date);
					System.out.println(dob);
					Employee e = new Employee(id, name, salary, dob);
					service.addEmployee(e);
				case 2:
					list.forEach(employee -> System.out.println(employee.getId()));
				case 3:
					list.forEach(employee -> System.out.println(employee));
				case 4:
					Collections.sort(list, (e1,e2) -> e1.getId() - e2.getId());
					list.forEach(employee -> System.out.println(employee));
				case 5:
					Collections.sort(list, (e1,e2) -> e1.getDob().compareTo(e2.getDob()));
					list.forEach(employee -> System.out.println(employee));
				case 6:
					Collections.sort(list, (e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary()));
					list.forEach(employee -> System.out.println(employee));
				case 7:
					Collections.sort(list, (e1,e2) -> e1.getName().compareTo(e2.getName()));
					list.forEach(employee -> System.out.println(employee));
				case 8:
					break;
			}
		}
		while(input != 8);
	}

}
