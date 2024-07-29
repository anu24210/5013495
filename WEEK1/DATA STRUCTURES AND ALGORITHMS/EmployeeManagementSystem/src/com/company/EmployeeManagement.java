package com.company;

public class EmployeeManagement {
    private Employee[] employees;
    private int size;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (size == employees.length) {
            return false; 
        }
        employees[size++] = employee;
        return true;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; 
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getEmployeeId() + ": " + employees[i].getName());
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
               
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                return true;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(5);

        
        management.addEmployee(new Employee(1, "Alice", "Manager", 75000));
        management.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        management.addEmployee(new Employee(3, "Charlie", "Analyst", 55000));

        System.out.println("Traversing employees:");
        management.traverseEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee employee = management.searchEmployee(2);
        if (employee != null) {
            System.out.println("Found: " + employee.getName());
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting employee with ID 2:");
        if (management.deleteEmployee(2)) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nTraversing employees after deletion:");
        management.traverseEmployees();
    }
}
