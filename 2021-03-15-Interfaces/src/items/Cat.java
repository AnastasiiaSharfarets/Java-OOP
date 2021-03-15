package items;

import interfaces.IMewable;

public class Cat extends Animals implements IMewable {
    String name;

    public Cat(String kind, String subspecies, String name) {
        super(kind, subspecies);
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void mew() {
        System.out.println("Mew");

    }
}
