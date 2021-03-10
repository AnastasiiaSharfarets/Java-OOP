package data;

import data.Employee;
import data.Person;

public class Manager extends Employee {
    int grade;//Класс data.Manager наследующий от data.Employee с полями:
    // int grade–позиционный уровень(в диапазоне от 1-4).


    public Manager() {
    }

    public Manager(String name, long id, int age, String company, double baseSalary,int grade) {
        super(name, id, age, company, baseSalary);
        if (grade >= 1 && grade <= 4)
            this.grade = grade;
        else
            System.out.println("Wrong grade");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
