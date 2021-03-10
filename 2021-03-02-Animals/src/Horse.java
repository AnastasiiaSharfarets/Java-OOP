public class Horse extends  Animal{
    private boolean haveHooves;

    public Horse(String nickname, String breed, int age, String gender, boolean haveHooves) {
        super(nickname, breed, age, gender);
        this.haveHooves = haveHooves;
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
        System.out.println("Igogo");
    }
}
