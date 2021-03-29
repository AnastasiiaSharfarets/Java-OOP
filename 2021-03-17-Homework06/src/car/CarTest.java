package car;

import comparators.ComparatorByYear;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {

    Car car1 = new Car(2001, "BMW", "black", 2.5, 18500.60);
    Car car2 = new Car(2004, "Mercedes", "black", 2.0, 20500.60);
    Car car3 = new Car(1990, "Reno", "red", 1.8, 1500.40);
    Car car4 = new Car(1984, "Lada", "white", 2.0, 500.60);
    Car car5 = new Car(2020, "Porsche", "black", 2.5, 50500.60);
    Car car6 = new Car(2008, "Opel", "green", 2.0, 9500.60);
    Car car7 = new Car(2008, "Mini", "black", 2.0, 11500.60);
    Car car8 = new Car(2001, "Citroen", "yellow", 2.0, 8500.60);
    Car car9 = new Car(2002, "Saab", "grey", 2.5, 9500.60);
    Car car10 = new Car(2014, "Nissan", "blue", 2.5, 15500.60);

    Car[] cars;


    @Before
    public void setUp() throws Exception {
        cars = new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }

    @Test
    public void testComparable() {
        Arrays.sort(cars);
        Car [] ex = new Car[] {car1, car8, car4, car2, car7, car10, car6, car5, car3, car9};
        assertArrayEquals(ex, cars);
    }

    @Test
    public void testComparatorByYear() {
        Arrays.sort(cars, new ComparatorByYear());
        for (int i = 0; i < cars.length - 1; i++) {
            assertTrue(cars[i].getYear() <= cars[i + 1].getYear());
        }
    }
}
