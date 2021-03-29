package comparators;

import car.Car;

import java.util.Comparator;

public class ComparatorByYearAndPrice implements Comparator<Car> {
/*
    Comparator<Car> comparatorByPrice = new ComparatorByPrice();
    Comparator<Car> comparatorByYear = new ComparatorByYear();
*/

    @Override
    public int compare(Car o1, Car o2) {
       /* int comparedByPrice = comparatorByPrice.compare(o1, o2);
        if (comparedByPrice != 0) {
            return comparedByPrice;
        }
        return comparatorByYear.compare(o1, o2);
    }*/
        int comparedByPrice = Double.compare(o1.getPrice(), o2.getPrice());
        //показать более новую машину
        return comparedByPrice != 0 ? comparedByPrice : o2.getYear() - o1.getYear();
    }
}
