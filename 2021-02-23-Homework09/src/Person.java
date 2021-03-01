public class Person {
    private String firstName;
    private String secondName;
    private String uniID;

    private int age;
    private String gender;
    private boolean higherEducation;

    public Person(String firstName, String secondName, String uniID, int age, String gender, boolean higherEducation) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.age = age;
        this.gender = gender;
        this.higherEducation = higherEducation;
    }

    public Person(String firstName, String secondName, String uniID, String gender, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.gender = gender;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHigherEducation(boolean higherEducation) {
        this.higherEducation = higherEducation;
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

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean isHigherEducation() {
        return higherEducation;
    }

    void eats() {
        System.out.println("Обед в 13:00 ");
    }

    void walk() {
        System.out.println("Хожу ");
    }

    public void setAge() {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", uniID='" + uniID + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", higherEducation=" + higherEducation +
                '}';
    }
}

