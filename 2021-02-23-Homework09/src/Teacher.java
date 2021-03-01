public class Teacher extends Person {
    private double salary;

    public Teacher(String firstName, String secondName, String uniID, String gender, int age) {
        super(firstName, secondName, uniID, gender, age);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void eats() {
        super.eats();
        //System.out.println("Завтрак в 9:00");
    }

    void teach(Student[] students) {
        System.out.println(getFirstName() + " " + getSecondName() + " " + "учит: ");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getSecondName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "inheritance.Teacher {" +
                "salary= " + salary +
                "}" +
                super.toString();
    }

    public String toDisplay() {
        return super.toString() + "для андроида";
    }
}
