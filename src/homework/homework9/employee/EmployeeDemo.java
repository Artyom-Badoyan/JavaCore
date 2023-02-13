package homework.homework9.employee;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print employees");
            System.out.println("Please input 3 for search employee by id");
            System.out.println("Please input 4 for search employee by company name");
            System.out.println("Please input 5 for search employee by salary range");
            System.out.println("Please input 6 for change employee position by id");
            System.out.println("Please input 7 for inactive employee by id");
            System.out.println("Please input 8 for activate employee by id");
            System.out.println("Please input 9 for print only active employees");

            String command = scanner.nextLine();
            switch (command) {
                case "0" -> isRun = false;
                case "1" -> addEmployee();
                case "2" -> employeeStorage.print();
                case "3" -> getEmployeeById();
                case "4" -> searchEmployeeCompanyName();
                case "5" -> employeeSalaryRange();
                case "6" -> changeEmployeePositionById();
                case "7" -> inactiveEmployeeById();
                case "8" -> activateEmployeeById();
                case "9" -> printActiveEmployees();
                default -> System.out.println("Wrong command Please try again.");

            }
        }
    }

    private static void printActiveEmployees() {
        System.out.println("Print only active employees");
        employeeStorage.printOnlyActiveEmployees();
    }

    private static void activateEmployeeById() {
        System.out.println("please input by id employee");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("employee with " + employeeId + " id dose not exists");
        } else {
            employeeStorage.inActiveEmployeeById(employeeId);
        }
    }

    private static void inactiveEmployeeById() {
        System.out.println("please input by id employee");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("employee with " + employeeId + " id dose not exists");
        } else {
            employeeStorage.activeEmployeeById(employeeId);
        }
    }

    private static void changeEmployeePositionById() {
        System.out.println("please input by id employee");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("employee with " + employeeId + " id dose not exists");
        } else {
            System.out.println("please input positions employee");
            String employeePositions = scanner.nextLine();
            employeeStorage.changeEmployeePositionInId(employeeId, employeePositions);
        }
    }

    private static void employeeSalaryRange() {
        System.out.println("Please input the employee's min wage");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input the employee's max wage");
        double max = Double.parseDouble(scanner.nextLine());
        employeeStorage.searchEmployeeSalaryRange(min, max);
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
            employeeStorage.active(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with " + employeeId + " id already exists");
        }
    }
}
