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
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employees");
            System.out.println("Please input 3 for search employee by id");
            System.out.println("Please input 4 for search employee by company name");

            String command = scanner.nextLine();
            switch (command) {
                case "0" -> {
                    isRun = false;
                    System.err.println("The program is complete");
                }
                case "1" -> {
                    System.err.println("Please input employee employeeId");
                    String id = scanner.nextLine();
                    System.err.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.err.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.err.println("Please input employee company");
                    String company = scanner.nextLine();
                    System.err.println("Please input employee position");
                    String position = scanner.nextLine();
                    System.err.println("Please input employee salary");
                    String salary = scanner.nextLine();
                    Employee employee = new Employee(id, name, surname, company, position, Double.parseDouble(salary));
                    employeeStorage.add(employee);
                    System.err.println("Employee is created");
                }
                case "2" -> employeeStorage.print();
                case "3" -> {
                    System.err.println("Please input keyword id");
                    String id = scanner.nextLine();
                    employeeStorage.searchById(id);
                }
                case "4" -> {
                    System.err.println("Please input keyword company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchCompanyName(companyName);
                }
                default -> System.err.println("Wrong command Please try again.");

            }
        }
    }
}
