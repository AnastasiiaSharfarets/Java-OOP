public class Cat extends Animal {
    private boolean catchMouse;
    private int lengthMustache;

    public Cat(String nickname, String breed, int age, String gender) {
        super(nickname, breed, age, gender);
    }

    public Cat(String nickname, String breed, int age, String gender, boolean catchMouse, int lengthMustache) {
        super(nickname, breed, age, gender);
        this.catchMouse = catchMouse;
        this.lengthMustache = lengthMustache;
    }

    @Override
    void move() {
        super.move();
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void drink() {
        super.drink();
    }

    @Override
    void makeSounds() {
        super.makeSounds();
        System.out.println("Meou");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catchMouse=" + catchMouse +
                ", lengthMustache=" + lengthMustache +
                '}';
    }
}
