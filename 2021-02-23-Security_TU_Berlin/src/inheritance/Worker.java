package inheritance;

public class Worker extends Person {
    public Worker(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);

    }

    @Override
    void eats() {
        System.out.println("Еду надо ещё заслужить!");
    }

    void works() {
        System.out.println("Отсюда и до зари!");
    }
}