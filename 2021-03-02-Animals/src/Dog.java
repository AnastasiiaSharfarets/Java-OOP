public class Dog extends Animal {
    private int lengthNose;
    private boolean sayGau;

    public Dog(String nickname, String breed, int age, String gender, int lengthNose, boolean sayGau) {
        super(nickname, breed, age, gender);
        this.lengthNose = lengthNose;
        this.sayGau = sayGau;
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
        System.out.println("Gau");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "lengthNose=" + lengthNose +
                ", sayGau=" + sayGau +
                '}';
    }
}
