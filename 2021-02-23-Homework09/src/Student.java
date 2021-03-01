public class Student extends Person {
    private double rating;
    private int ISIC;
    private double scholarship;
    private String faculty;

    public Student(String firstName, String secondName, String uniID, String gender, int age) {
        super(firstName, secondName, uniID, gender, age);
    }

    public void payForStudy(int euro) {
        System.out.println("Плачу " + euro + " евро");
    }



    @Override
    void eats() {
        super.eats();
        System.out.println("Ужин в 18:00");
    }

    void study() {
        System.out.println("Учится ");
    }
}
