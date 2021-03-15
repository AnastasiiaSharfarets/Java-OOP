package data;

import java.util.Objects;

public abstract class Person {
    String name;
    long id;
    int age;

    public Person() {
        name = "No name";
    }

    public Person(String name, long id, int age) {
        setName(name);
        setId(id);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty())
            this.name = name;
        else
            System.out.println("Wrong name");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId();
    }

}
