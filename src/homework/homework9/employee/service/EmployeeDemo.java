package homework.homework9.employee.service;

import homework.homework9.employee.Commands;
import homework.homework9.employee.model.Company;
import homework.homework9.employee.model.Employee;
import homework.homework9.employee.storaje.CompanyStorage;
import homework.homework9.employee.storaje.EmployeeStorage;
import homework.homework9.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();


    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        Company company = new Company("company001", "company example", "Gyumri", "1234567");
        company.setEmployeeCount(3);
        companyStorage.add(company);

        employeeStorage.add(new Employee("poxos", "poxosyan", "a001", 100, company, "jr. manager", new Date(), DateUtil.stringToDate("15/02/1989")));
        employeeStorage.add(new Employee("petros", "petrosyan", "a002", 200, company, "manager", new Date(), DateUtil.stringToDate("20/05/1995")));
        employeeStorage.add(new Employee("martiros", "martirosyan", "a003", 300, company, "sr. manager", new Date(), DateUtil.stringToDate("02/08/2000")));

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT -> isRun = false;
                case ADD_EMPLOYEE -> addEmployee();
                case ADD_COMPANY -> addCompany();
                case PRINT_EMPLOYEES -> employeeStorage.print();
                case SEARCH_EMPLOYEES_BY_ID -> getEmployeeById();
                case SEARCH_EMPLOYEES_BY_COMPANY_ID -> searchEmployeeCompanyName();
                case SEARCH_EMPLOYEES_BY_SALARY_RANGE -> searchEmployeeBySalaryRange();
                case CHANGE_EMPLOYEE_POSITION -> changePositionByEmployeeId();
                case PRINT_ONLY_ACTIVE_EMPLOYEES -> employeeStorage.printByStatus(true);
                case INACTIVATE_EMPLOYEE_BY_ID -> inactivateEmployee();
                case ACTIVATE_EMPLOYEE_BY_ID -> activateEmployee();
                case PRINT_ALL_COMPANIES -> companyStorage.print();
                default -> System.out.println("Wrong command Please try again.");

            }
        }
    }

    private static void addCompany() {
        System.out.println("Please input id, name, address, phoneNumber");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company  was added!");
        } else {
            System.out.println("Company with " + companyId + " already exists!");
        }
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
        companyStorage.print();
        System.out.println("Please input company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            employeeStorage.searchEmployeeByCompany(companyById);
        } else {
            System.out.println("Company does not exists!");
        }
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

    private static void addEmployee() throws ParseException {
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("Please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("Please input name, surname, employeeId, salary, position, dateOfBirthday(15/02/2023)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeId = employeeData[2];
            Employee employeeById = employeeStorage.getEmployeeById(employeeId);
            if (employeeById == null) {
                Employee employee = new Employee(employeeData[0], employeeData[1],
                        employeeId, Double.parseDouble(employeeData[3]), companyById,
                        employeeData[4], new Date(), DateUtil.stringToDate(employeeData[5]));
                employeeStorage.add(employee);
                companyById.setEmployeeCount(companyById.getEmployeeCount() + 1);
                System.out.println("Employee was added!");
            } else {
                System.out.println("Employee with " + employeeId + " id already exists");
            }
        } else {
            System.out.println("Wrong company id! please try again!");
        }
    }
}