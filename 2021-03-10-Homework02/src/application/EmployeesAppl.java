package application;

import data.Employee;
import data.Manager;
import data.SalesMan;
import data.WageEmployee;

public class EmployeesAppl {
    public static void main(String[] args) {
        Manager m1 = new Manager("Ivanov", 1000, 23, "H&M", 1500, 3);
        Manager m2 = new Manager("Petrov", 1001, 28, "H&M", 1700, 2);

        SalesMan sm1 = new SalesMan("Sidorov", 1002, 33,
                "H&M", 1500, 3300.9, 12);
        SalesMan sm2 = new SalesMan("Durov", 1900, 34,
                "H&M", 2008, 2999.99, 20);

        WageEmployee we1 = new WageEmployee("Rogov", 1200, 34, "H&M", 2000.45, 23, 13.54);
        WageEmployee we2 = new WageEmployee("Pirogov", 1202, 36, "H&M", 2030.9, 34, 14.9);

        Employee[] emps = new Employee[]{m1, m2, sm1, sm2, we1, we2};

        printEmployee(emps);
    }

    public static void printEmployee(Employee[] emps) {
        for (Employee e : emps) {
            System.out.println(e);
        }
    }
}
