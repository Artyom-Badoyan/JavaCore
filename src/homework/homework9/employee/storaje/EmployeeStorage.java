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

    public void searchEmployeeSalaryRange(double min, double max) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= min && employees[i].getSalary() <= max) {
                System.out.println(employees[i]);
            }
        }
    }

    public void changeEmployeePositionInId(String id, String positions) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                employees[i].setPosition(positions);
                System.out.println(employees[i]);
                break;
            }
        }
    }

    public void activeEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                employees[i].setActive(false);
                System.out.println(employees[i]);
                break;
            }
        }
    }

    public void active(Employee employee) {
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(employee)) {
                employees[i].setActive(true);
                System.out.println(employees[i]);
                break;
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

    public void inActiveEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id) && employees[i].isActive() == false) {
                employees[i].setActive(true);
                System.out.println(employees[i]);
                break;
            } else if (employees[i].isActive() == true) {
                System.out.println("This worker's asset has been set to true " + employees[i]);
            }
        }
    }
}

