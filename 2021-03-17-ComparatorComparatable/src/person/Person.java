package person;

public class Person implements Comparable<Person> {

    private int birthYear;
    private String name;

    public Person(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public Person() {
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthYear=" + birthYear +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //return o.birthYear - birthYear;//по уменьшению года рождения
        //return birthYear - o.birthYear;//по увеличению года рождения
        return name.compareTo(o.name);
        //int res = birthYear - o.birthYear;//сортирует по году вверх и одинаковы по имени
        //return res == 0 ? name.compareTo(o.name) : res;
    }
}
