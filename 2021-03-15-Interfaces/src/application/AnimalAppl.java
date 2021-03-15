package application;

import interfaces.IBarkable;
import items.Animals;
import items.Cat;
import items.Dog;
import items.Tuki;

public class AnimalAppl {

    public static void main(String[] args) {
        Animals[] anAr = {
                new Cat("kind of cat", "cats", "Vasya"),
                new Cat("kind of cat", "cats", "Masha"),
                new Dog("kind of dog", "dogs", "Boss"),
                new Dog("kind of dog", "dogs", "Moss"),
                new Tuki("chord", "birds", "Green", "Gosha"),
                new Tuki("chord", "birds", "Green", "Kesha"),
    };
        printAllBarkable(anAr);
}

    private static void printAllBarkable(Animals[] anAr) {
        for (Animals a : anAr){
            if(a instanceof IBarkable){
                IBarkable temp = (IBarkable) a;
                temp.bark();
                System.out.println(a);
            }
        }
    }
}
