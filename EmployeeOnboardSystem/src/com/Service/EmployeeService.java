package com.Service;

import java.util.List;
import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {

	private Scanner scanner;
	private EmployeeDao employeeservice;

	public EmployeeService() {
		this.employeeservice = new EmployeeDao();
		this.scanner = new Scanner(System.in);
	}

	public void addEmployee() {
		System.out.println("Enter employee details:");
		System.out.print("First Name: ");
		String F_Name = scanner.nextLine();
		System.out.print("Last Name: ");
		String L_Name = scanner.nextLine();
		System.out.print("Employee Number: ");
		long emNo = scanner.nextLong();
		System.out.print("Employee Email: ");
		scanner.nextLine(); // Consume newline character
		String E_Email = scanner.nextLine();
		System.out.println("Employee Contactno.:");
		long E_Contactno = scanner.nextLong();
		System.out.println("Employee Location:");
		scanner.nextLine(); // Consume newline character
		String E_Address = scanner.nextLine();
		System.out.println("Employee designation:");
		String E_post = scanner.nextLine();

		// You can add more input validations if needed

		Employee employee = new Employee(F_Name, L_Name, emNo, E_Email, E_Contactno, E_Address, E_post);
		employeeservice.addEmployee(employee);
		System.out.println("Employee added successfully!");
	}

	public void updateEmployee() {
		System.out.print("Enter employee number to update: ");
		long employeeNumber = scanner.nextLong();
		Employee existingEmployee = employeeservice.getByEmNo(employeeNumber);
		if (existingEmployee != null) {
			System.out.println("Enter updated employee details:");
			System.out.print("First Name: ");
			String F_Name = scanner.nextLine();
			scanner.nextLine();			
			System.out.print("Last Name: ");
			String L_Name = scanner.nextLine();
			System.out.print("Employee Email: ");
			String E_Email = scanner.nextLine();
			System.out.println("Employee Contactno: ");
			long E_Contactno = scanner.nextLong();
			scanner.nextLine();
			
			System.out.println("Employee Location: ");
			String E_Address = scanner.nextLine();
			
			System.out.println("Employee designation:");
			String E_post = scanner.nextLine();

			// You can add more input validations if needed

			Employee updatedEmployee = new Employee(F_Name, L_Name, employeeNumber, E_Email, E_Contactno, E_Address,
					E_post);
			employeeservice.updateEmployee(updatedEmployee);
			System.out.println("Employee updated successfully!");
		} else {
			System.out.println("Employee not found!");
		}
	}

	public void deleteEmployee() {
		System.out.print("Enter employee number to delete: ");
		long employeeNumber = scanner.nextLong();
		employeeservice.deleteEmployee(employeeNumber);
		System.out.println("Employee deleted successfully!");
	}

	public void viewEmployeeDetails() {
		System.out.print("Enter employee number to view details: ");
		long employeeNumber = scanner.nextLong();
		Employee employee = employeeservice.getByEmNo(employeeNumber);
		if (employee != null) {
			System.out.println("Employee Details:\n" + employee);
		} else {
			System.out.println("Employee not found!");
		}
	}

	public void viewAllEmployees() {
		List<Employee> employees = employeeservice.getAllEmployees();
		if (employees.isEmpty()) {
			System.out.println("No employees found.");
		} else {
			System.out.println("All Employees:");
			for (Employee employee : employees) {
				System.out.println(employee);
			}

		}
	}
}
