public class Fish extends Animal{
    private int numberFins;

    public Fish(String nickname, String breed, int age, String gender, int numberFins) {
        super(nickname, breed, age, gender);
        this.numberFins = numberFins;
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
        System.out.println("Bul-bul");
    }
}
