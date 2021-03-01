public class Worker extends Person {
    boolean isFullTime;

    public Worker(String firstName, String secondName, String uniID, String gender, int age) {
        super(firstName, secondName, uniID, gender, age);
    }

    public void receiveSalary(int euro) {
        System.out.println("Получаю зарплату " + euro + " евро");
    }

    @Override
    void eats() {
        System.out.println("Еду надо заслужить");
        ;
    }

    void works() {
        System.out.println("Отсюда и до зари ");
    }
}
