public class Swan {
    String name;
    String color;
    int id;
    int age;

    public void toDisplay() {
        System.out.println(
                "Имя лебедя: " + name + "\n" +
                        "Цвет: " + color + "\n" +
                        "id: " + id + "\n" +
                        "Возраст: " + age + "\n"
        );
    }
}
