package homework.homework9.employee;

import java.util.Scanner;

/*
0 for exit (0 սեղմելու դեպքում ծրագիրը վերջանալու է)
1 add employee (1 սեղմելու դեպքում ուզելու է բոլոր տվյալները աշխատակից սարքելու,
  ու սարքելու է իրա օբյեկտը ու քցի EmployeeStorage-ի մեջ)
2 print all employee(տպելու է բոլոր աշխատակիցներին)
3 search employee by employee ID (փնտրելու է աշխատակից իր իդ-ով)
4 search employee by company name  (տալու ենք ընկերության անունը, տպի իրա բոլոր աշխատակիցներին)
*/
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

            String command = scanner.nextLine();
            switch (command) {
                case "0" -> isRun = false;
                case "1" -> addEmployee();
                case "2" -> employeeStorage.print();
                case "3" -> getEmployeeById();
                case "4" -> searchEmployeeCompanyName();
                default -> System.out.println("Wrong command Please try again.");

            }
        }
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
        String[] employeeData = employeeDataStr.split(",");
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
