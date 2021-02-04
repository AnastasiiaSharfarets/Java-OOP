public class Swan {
    String type;
    String color;
    String name;
    boolean gender;
    int age;
    double weight;
    int distance;

    public void fly(int km) {
        System.out.println("Лебедь пролетел " + km + " километров");
        distance += km;
    }

    public void displayInfo() {
        System.out.println("Порода лебедя: " + type);
        System.out.println("Цвет лебедя: " + color);
        System.out.println("Имя лебедя: " + name);
        System.out.println("Пол лебедя: " + (gender ? "женский" : "мужской"));
        System.out.println("Возраст лебедя: " + age);
        System.out.println("Вес лебедя: " + weight);
        System.out.println("**************");
    }
}

class TestSwan {
    public static void main(String[] args) {
        Swan swan1 = new Swan();
        swan1.type = "Лебедь-кликун";
        swan1.color = "Белый";
        swan1.name = "Коля";
        swan1.gender = false;
        swan1.age = 5;
        swan1.weight = 15.300;
        swan1.fly(45);
        swan1.displayInfo();

        Swan swan2 = new Swan();
        swan2.type = "Лебедь-шипун";
        swan2.color = "Серый";
        swan2.name = "Оля";
        swan2.gender = true;
        swan2.age = 7;
        swan2.weight = 11.300;
        swan2.fly(34);
        swan2.displayInfo();



    }

}