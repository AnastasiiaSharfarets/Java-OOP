public class User {
    private String name;
    private String nick;
    private String email;
    private double bodyMassIndex;
    private int height;
    private double weight;

    User(String name, String nick, String email,
         int height, double weight) {
        this.name = name;
        this.nick = nick;
        this.email = email;
        this.height = height;
        this.weight = weight;
    }

    private void setBodyMassIndex() {
        double h = height / 100;
        bodyMassIndex = weight / (h * h);
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }
}

class TestUser {
    public static void main(String[] args) {
        User myLovelyUser = new User("Donny", "driver",
                "donny@mail.com", 200, 100.0);
        System.out.println(myLovelyUser.getBodyMassIndex());
    }
}

