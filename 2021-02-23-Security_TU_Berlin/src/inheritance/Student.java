package inheritance;

public class Student extends Person {
    private double rating;

    public Student(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);
        rating = 10.0;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Студент{ " + "\n" +
                "firstname " + super.getFirstName() + "\n" +
                "secondName " + super.getSecondName() + "\n" +
                "uniID " + super.getUniID() + "\n" +
                "рейтинг " + rating;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Ужин в 18:00");
    }

    void study() {
        //бизнес логика
        System.out.println("А чё, ну я же учу!");
    }


}