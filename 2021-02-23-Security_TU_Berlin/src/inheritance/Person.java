package inheritance;

public class Person {
    private String firstName;
    private String secondName;
    private String uniID;
    private int ageWork;
    // save save firstname, save lastname, save rating
    // сериализация и десериализация
    // load

    // API 0.0.5
    public Person(String firstName, String secondName, String uniID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
    }

    // 0.1.1
    public Person(String firstName, String secondName, String uniID, int ageWork) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.ageWork = ageWork;
    }

    // 0.2.1

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUniID() {
        return uniID;
    }

    void eats() {
        System.out.println("Обед в 13:00");
    }

    @Override
    public String toString() {
        return "\n" +
                "firstname " + firstName + "\n" +
                "secondName " + secondName + "\n" +
                "uniID " + uniID + "\n";
    }
}