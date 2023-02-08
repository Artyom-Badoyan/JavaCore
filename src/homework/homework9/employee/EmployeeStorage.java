package homework.homework9.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == array.length) {
            extend();
        }
        array[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.err.println(array[i] + " ");
        }
    }

    public void searchById(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeId().contains(id)) {
                found = true;
                System.err.println(employee);
            }
        }
        if (!found) {
            System.err.println("employee with " + id + "does not exists");
        }
    }

    public void searchCompanyName(String companyName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(companyName)) {
                found = true;
                System.err.println(employee);
            }
        }
        if (!found) {
            System.err.println("company name with " + companyName + "does not exists");
        }
    }
}

