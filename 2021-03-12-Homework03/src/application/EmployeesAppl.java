package application;

import data.*;

public class EmployeesAppl {

    public static void main(String[] args) {
        Manager m1 = new Manager("Ivanov", 1000, 23, "H&M", 1500, 3);
        Manager m2 = new Manager("Petrov", 1001, 28, "H&M", 1700, 2);
        Manager m3 = new Manager("Kuzin", 1008, 30, "H&M", 1900, 1);

        SalesMan sm1 = new SalesMan("Sidorov", 1002, 33,
                "H&M", 1500, 3300.9, 12);
        SalesMan sm2 = new SalesMan("Durov", 1900, 34, "H&M", 2000, 2999.99, 20);
        SalesMan sm3 = new SalesMan("Gurov", 1909, 44, "H&M", 2000, 3999.99, 30);

        WageEmployee we1 = new WageEmployee("Rogov", 1200, 34, "H&M", 0, 23, 13.54);
        WageEmployee we2 = new WageEmployee("Pirogov", 1202, 36, "H&M", 0, 34, 14.9);
        WageEmployee we3 = new WageEmployee("Permyakov", 1222, 38, "H&M", 0, 39, 14.9);

        Employee[] emps = new Employee[]{m1, m2, m3, sm1, sm2, sm3, we1, we2, we3};

        printEmployee(emps);
        System.out.println("==================");
        System.out.println("The sum of all employees' salaries: " + getSumSalaryAllEmployees(emps));
        System.out.println("==================");
        System.out.println("Salary is or more than 1000 euro :");
        printEmpsWithSalaryMoreThan(emps, 1000);
        System.out.println("==================");
        System.out.println("Tolal sales: " + getCompanyRevenue(emps));

    }
    //Напишите метод double getСompanyRevenue (emps) принимающий массив сотрудников и
    //возвращающий доход компании(сумма продаж всех менеджеров по продажам)

    private static double getCompanyRevenue(Employee[] emps) {
        double result = 0;
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] instanceof SalesMan) {
                SalesMan salesMan = (SalesMan) emps[i];//даункастинг для получения более конкретной ссылки на объект типа SalesMan
                result += salesMan.getTotalSales();
            }
        }
        return result;
    }

    //метод double getSumSalaryAllEmployees(emps) принимающий массив сотрудников и
    //возвращающий сумму всех зарплат всех сотрудников.
    private static double getSumSalaryAllEmployees(Employee[] employees) {
        double res = 0;
        for (int i = 0; i < employees.length; i++) {
            res += employees[i].calcSalary();
        }
        return res;
    }

    //метод void printEmpsWithSalaryMoreThan(emps, salary) который принимает массив сотрудников
    //и значение зарплаты с которой будем сравнивать. Метод выводит на консоль
    //сотрудников у которых заработная плата равна или выше чем переданная в метод salary.
    private static void printEmpsWithSalaryMoreThan(Employee[] employees, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].calcSalary() >= salary) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static void printEmployee(Employee[] emps) {
        for (Employee e : emps) {
            System.out.println(e.toString());
            System.out.println("Salary = " + e.calcSalary());
        }

    }

}
