package data;

public abstract class Employee extends Person {
    String company;
    double baseSalary;//базовая зп в евро

    public Employee() {
    }

    public Employee(String name, long id, int age, String company, double baseSalary) {
        super(name, id, age);
        setCompany(company);
        setBaseSalary(baseSalary);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null && !company.trim().isEmpty())
            this.company = company;
        else
            System.out.println("No company");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0 && baseSalary < 10_000.00)
            this.baseSalary = baseSalary;
        else
            System.out.println("Wrong baseSalary");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", baseSalary=" + baseSalary + " euro " +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public abstract double calcSalary();

}
