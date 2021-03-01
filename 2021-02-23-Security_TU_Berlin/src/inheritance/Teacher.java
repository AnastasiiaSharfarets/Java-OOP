package inheritance;

public class Teacher extends Person {
    private double salary; // в долларах
    private int workAge;

    public Teacher(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);
        setSalary(45000);
    }


    public Teacher() {
    }

    public void setSalary(double salary) {
        this.salary = salary; // умножить коофициент
    }

    @Override
    void eats() {
        super.eats();
    }

    void teach() {
        System.out.println("Если выучил, то можете выучить и вы!");
    }

/*    @Override
    void walks() {
        super.walks();
    }*/

    void treats() {
        System.out.println("Лечиться в санатории после тяжелой работы с учениками");
    }

    @Override
    public String toString() {
        return "Учитель " + super.toString() + "\n" +
                "salary: " + salary;

    }

}