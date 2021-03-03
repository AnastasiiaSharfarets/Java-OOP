public class Car {
    int wheels = 4;
    int mileAge;
    String color;
    String carID;
    int doors;
    String brandName;
    String label;
    boolean registration;

    public void move(int distance) {
        System.out.println("Мы поехали");
        //mileAge +- distance;
        mileAge = mileAge + distance;
    }

    public void recolor(String newColor) {
        color = newColor;
    }

    public void displayInfo() {
        System.out.println("Количество колес " + wheels);
        System.out.println("Киломераж " + mileAge);
        System.out.println("Цвет машины " + color);
        System.out.println("Номер двигателя " + carID);
        System.out.println("Количество дверей " + doors);
        System.out.println("Марка машины " + brandName);
        System.out.println("Модель машины " + label);
        System.out.println("Регистрация " + (registration ? "yes" : "no"));
    }


}

class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        Car toyota = new Car();
        Car porsche = new Car();
        //дефолтные значения
       /* System.out.println(porsche.brandName);
        System.out.println(porsche.doors);
        System.out.println(porsche.registration);*/
        porsche.move(1200);
       /* System.out.println(porsche.mileAge);
        System.out.println(porsche.wheels);*/
        //porsche.registration = true;
        //porsche.displayInfo();
        porsche.color = "Yellow";
        //porsche.displayInfo();
        porsche.recolor("Pink");
        porsche.displayInfo();
        porsche.recolor("Green");
        porsche.displayInfo();
    }
}
