package Swans02;
//Лебеди и Книги из предыдущего урока. Переделать Классы, создать конструкторы, 5-10 разных конструкторов.
//Создать класс с мейном в отдельном файле.
//Создать по 5-10 объектов.
//Создать массив объектов.
//*Отсортировать массив лебедей по возрасту.
//Отсортировать массив книг по количеству страниц или году издания, или тиражу.
public class Swan {
    String name;
    String breed;
    String color;
    String gender;
    int age;

    public Swan(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Swan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Swan(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public Swan(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Swan(String breed, String name, String gender, String color, int age) {
        this.breed = breed;
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }

    public void toDisplay() {
        System.out.println("Имя: "+name + "," +
                " возраст: " + age
                + ", порода: " + breed +
                ", пол: " + gender + ", цвет: " + color);
    }
}