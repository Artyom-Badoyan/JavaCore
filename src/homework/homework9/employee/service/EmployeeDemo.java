package homework.homework9.employee.service;

import homework.homework9.employee.model.Employee;
import homework.homework9.employee.storaje.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {

            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case "0" -> isRun = false;
                case "1" -> addEmployee();
                case "2" -> employeeStorage.print();
                case "3" -> getEmployeeById();
                case "4" -> searchEmployeeCompanyName();
                case "5" -> searchEmployeeBySalaryRange();
                case "6" -> changePositionByEmployeeId();
                case "7" -> employeeStorage.printByStatus(true);
                case "8" -> inactivateEmployee();
                case "9" -> activateEmployee();
                default -> System.out.println("Wrong command Please try again.");

            }
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print employees");
        System.out.println("Please input 3 for search employee by id");
        System.out.println("Please input 4 for search employee by company name");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactivate employee by id");
        System.out.println("Please input 9 for activate employee by id");
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        employeeStorage.getEmployeeById(employeeId);
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is active. Please try again!");
        } else {
            employee.setActive(true);
            System.out.println("Status changed!");
        }
    }

    private static void inactivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        employeeStorage.getEmployeeById(employeeId);
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is inactive. Please try again!");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }

    private static void changePositionByEmployeeId() {
        employeeStorage.print();
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        employeeStorage.getEmployeeById(employeeId);
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Wrong employee ID, please try again!");
        } else {
            System.out.println("please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("Position changed!");
        }
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Please input minPrice, maxPrice");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        Double minPrice = Double.parseDouble(salaryRange[0]);
        Double maxPrice = Double.parseDouble(salaryRange[1]);
        if (maxPrice < minPrice) {
            System.out.println("minPrice should be less then maxPrice");
            return;
        }
        employeeStorage.searchBySalaryRange(minPrice, maxPrice);
    }

    private static void searchEmployeeCompanyName() {
        System.out.println("Please input company name");
        String companyName = scanner.nextLine();
        employeeStorage.searchEmployeeByCompanyName(companyName);
    }

    private static void getEmployeeById() {
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("employee with " + employeeId + " id dose not exists");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() {
        System.out.println("Please input name, surname, employeeId, salary, companyName, position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(" ");
        String employeeId = employeeData[2];
        Employee employeeById = employeeStorage.getEmployeeById(employeeId);
        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeId,
                    Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employeeStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with " + employeeId + " id already exists");
        }
    }
}
