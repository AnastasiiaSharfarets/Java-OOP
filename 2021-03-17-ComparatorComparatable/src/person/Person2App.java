package person;

import comparators.ComparatorByAge;
import comparators.ComparatorByName;

import java.util.Arrays;
import java.util.Comparator;

public class Person2App {
    public static void main(String[] args) {
        Person2[] persons = {
                new Person2("Vasya",18),
                new Person2("Olya", 44),
                new Person2("Ivan", 34),
                new Person2("Oleg", 23),
                new Person2("Masha",20),
        };
        System.out.println("Display persons: ");
        displayPersons(persons);

        Comparator<Person2> comp = new ComparatorByAge();
        Arrays.sort(persons, comp);
        System.out.println("============================");
        System.out.println("Sort persons by age");
        displayPersons(persons);

        Arrays.sort(persons, new ComparatorByName());
        System.out.println("============================");
        System.out.println("Sort persons by name");
        displayPersons(persons);

    }

    private static void displayPersons(Person2[] persons) {
        for (Person2 p : persons) {
            System.out.println(p);
        }
    }
}
