package data;

public class Person {
    String name;
    long id;
    int age;

    public Person() {
        name = "No name";
    }

    public Person(String name, long id, int age) {
        if (name != null && !name.trim().isEmpty())
            this.name = name;
        else
            this.name = "No name";

        setId(id);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id >= 0 && id <= 1_000_000_000)
            this.id = id;
        else
            System.out.println("Wrong id");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150)
            this.age = age;
        else
            System.out.println("Wrong age");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
