package Java_FSE.week_1.Algorithms_and_Data_Structures.Employee_Management_System;

import java.util.Scanner;

public class EmployeeManagement {

    private final int MAX_EMPLOYEES = 100;
    private Employee[] employees;
    private int employeeCount;

    public EmployeeManagement() {
        employees = new Employee[MAX_EMPLOYEES];
        employeeCount = 0;
    }

    public void addEmployee(Employee newEmployee) {
        if (employeeCount < MAX_EMPLOYEES) {
            employees[employeeCount] = newEmployee;
            employeeCount++;
        } else {
            System.out.println("\nError: Cannot add more employees. Array is full.");
        }
    }

    public boolean searchEmployee(int employeeId) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                System.out.println("\nEmployee found with ID: " + employees[i].getEmployeeId());
                return true;
            }
        }
        System.out.println("\nEmployee not found with ID: " + employeeId);
        return false;
    }

    public void traverseEmployees() {
        System.out.println("\nEmployee List:");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].printEmployee();;
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                for (int j = i; j < employeeCount - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employeeCount--;
                System.out.println("\nEmployee deleted with ID: " + employeeId);
                return true;
            }
        }
        System.out.println("\nError: Cannot delete employee. Employee not found with ID: " + employeeId);
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();

        employeeManagement.addEmployee(new Employee(1, "Rahul Joshi", "Software Engineer", 75000));
        employeeManagement.addEmployee(new Employee(2, "Sikha Dutta", "Software Engineer", 80000));
        employeeManagement.addEmployee(new Employee(5, "Arijit Das", "Software Engineer", 100000));
        employeeManagement.searchEmployee(1);
        employeeManagement.traverseEmployees();
        employeeManagement.deleteEmployee(1);
        employeeManagement.traverseEmployees();

        scanner.close();
    }
}