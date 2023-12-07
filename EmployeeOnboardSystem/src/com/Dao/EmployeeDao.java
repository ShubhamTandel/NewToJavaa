package com.Dao;
import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;

public class EmployeeDao {

	private static ArrayList<Employee> list = new ArrayList<>();

	public static void addEmployee(Employee employee) {
		list.add(employee);
		System.out.println("Employee added");
	}


    public Employee getByEmNo(long emNo) {
        for (Employee employee : list) {
            if (employee.getEmNo() == emNo) {
                return employee;
            }
        }
        return null;
    }
	public void updateEmployee(Employee updatedEmployee) {
		for (int i = 0; i < list.size(); i++) {
			Employee employee = list.get(i);
			if (employee.getEmNo() == updatedEmployee.getEmNo()) {
				list.set(i, updatedEmployee);
				break;
			}
		}
	}

	public void deleteEmployee(long emNo) {
		list.removeIf(employee -> employee.getEmNo() == emNo);
	}

	public List<Employee> getAllEmployees() {
		return new ArrayList<>(list);

	}


	
}