package car;

import comparators.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class CarApp {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(2001, "BMW", "black", 2.5, 18500.60),
                new Car(2004, "Mercedes", "black", 2.0, 20500.60),
                new Car(1990, "Reno", "red", 1.8, 1500.40),
                new Car(1984, "Lada", "white", 2.0, 500.60),
                new Car(2020, "Porsche", "black", 2.5, 50500.60),
                new Car(2008, "Opel", "green", 2.0, 9500.60),
                new Car(2008, "Mini", "black", 2.0, 11500.60),
                new Car(2001, "Citroen", "yellow", 2.0, 8500.60),
                new Car(2002, "Saab", "grey", 2.5, 9500.60),
                new Car(2014, "Nissan", "blue", 2.5, 15500.60),
        };
        System.out.println("Display all cars: ");
        displayCars(cars);

        Arrays.sort(cars);
        System.out.println("Sort cars by model: ");
        displayCars(cars);

        Comparator<Car> comp = new ComparatorByYear();
        Arrays.sort(cars,comp);
        System.out.println("Sort cars by year: ");
        displayCars(cars);

        comp = new ComparatorByColour();
        Arrays.sort(cars,comp);
        System.out.println("Sort cars by colour: ");
        displayCars(cars);

        comp = new ComparatorByPrice();
        Arrays.sort(cars,comp);
        System.out.println("Sort by price: ");
        displayCars(cars);

        comp = new ComparatorByEngine();
        Arrays.sort(cars,comp);
        System.out.println("Sort by engine: ");
        displayCars(cars);

        comp = new ComparatorByYearAndPrice();
        Arrays.sort(cars,comp);
        System.out.println("Sort first by price, if price the same sort by year: ");
        displayCars(cars);
    }

    private static void displayCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + 1 + ".    " + cars[i]);
        }
        System.out.println("=======================================================================================");

    }
}
