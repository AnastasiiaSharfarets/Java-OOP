public class User {
    String name;
    String email;

    @Override
    public String toString() {
        return super.toString() + " " + this.name;
    }
}
