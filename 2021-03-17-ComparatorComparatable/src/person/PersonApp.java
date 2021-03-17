package person;

import java.util.Arrays;

public class PersonApp {

    public static void main(String[] args) {
        Person[] persons = {
                new Person(1982, "Vasya"),
                new Person(1990, "Olya"),
                new Person(1982, "Ivan"),
                new Person(1980, "Oleg"),
                new Person(1970, "Masha"),
        };
        displayPersons(persons);
        Arrays.sort(persons);
        System.out.println("=================================================");
        displayPersons(persons);
    }

    private static void displayPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }

    }
}
