package com.Controller;

import java.util.List;
import java.util.Scanner;

import com.Service.EmployeeService;
public class EmployeeController {

    private EmployeeService employeeservice;
    private Scanner scanner;

    public EmployeeController() {
        this.employeeservice = new EmployeeService();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View Employee Details");
            System.out.println("5. View All Employees");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                	updateEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    viewEmployeeDetails();
                    break;
                case 5:
                    viewAllEmployees();
                    break;
                case 0:
                    System.out.println("Exiting the Employee System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
    }
    public void addEmployee() {
        employeeservice.addEmployee();
    }

    private void updateEmployee() {
        employeeservice.updateEmployee();
    }

    private void deleteEmployee() {
        employeeservice.deleteEmployee();
    }

    private void viewEmployeeDetails() {
        employeeservice.viewEmployeeDetails();
    }

    private void viewAllEmployees() {
        employeeservice.viewAllEmployees();
    }

    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        employeeController.start();
        employeeController.scanner.close();
    }
}