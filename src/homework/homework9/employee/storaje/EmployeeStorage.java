package homework.homework9.employee.storaje;

import homework.homework9.employee.model.Employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (employees.length == size) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void printByStatus(boolean isActive) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == isActive) {
                System.out.println(employees[i]);
            }
        }
    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchEmployeeByCompanyName(String companyName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(companyName)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchBySalaryRange(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= minPrice && employees[i].getSalary() <= maxPrice) {
                System.out.println(employees[i]);
            }
        }
    }

    public void printOnlyActiveEmployees() {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == true) {
                System.out.println(employees[i]);
            }
        }
    }
}

