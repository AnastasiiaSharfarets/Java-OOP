package data;

import data.Employee;

public class SalesMan extends Employee {
    double totalSales;
    int bonus;// в процентах

    public SalesMan() {
    }

    public SalesMan(String name, long id, int age, String company, double baseSalary, double totalSales, int bonus) {
        super(name, id, age, company, baseSalary);
        this.totalSales = totalSales;
        setBonus(bonus);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus >= 0 && bonus <= 100)
            this.bonus = bonus;
        else
            System.out.println("Wrong bonus");
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", totalSales=" + totalSales +
                ", bonus=" + bonus +
                '}';
    }
}
