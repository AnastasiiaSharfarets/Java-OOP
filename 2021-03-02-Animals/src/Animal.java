//Создайте базовый класс домашних животных и несколько дочерних классов:
// кот, собака, рыбка, лошадь.
//Продумайте какие поля у объектов общие, а какие уникальные
//Добавьте методы в родительский класс и переопределите их в дочерних: есть, пить, издавать звуки, двигаться
public class Animal {
    private String nickname;
    private String breed;
    private int age;
    private String gender;

    public Animal(String nickname, String breed, int age, String gender) {
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String isGender() {
        return gender;
    }

    void move(){
        System.out.println("I move");
    }

    void eat(){
        System.out.println("I eat");
    }
    void drink(){
        System.out.println("I drink");
    }
    void makeSounds(){
        System.out.println("I make a sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
