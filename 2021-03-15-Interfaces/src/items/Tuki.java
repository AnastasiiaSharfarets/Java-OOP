package items;

import interfaces.IBarkable;
import interfaces.IChirikable;
import interfaces.IMewable;

public class Tuki extends Animals implements IChirikable, IBarkable, IMewable {
    String color;
    String nick;

    public Tuki(String kind, String subspecies, String color, String nick) {
        super(kind, subspecies);
        this.color = color;
        this.nick = nick;
    }

    public Tuki(String color, String nick) {
        this.color = color;
        this.nick = nick;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Tuki{" +
                "kind='" + kind + '\'' +
                ", subspecies='" + subspecies + '\'' +
                ", color='" + color + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }

    @Override
    public void chirik() {
        System.out.println("Chirik-chirik");

    }

    @Override
    public void bark() {
        System.out.println("Bark-chirik");
    }

    @Override
    public void mew() {
        System.out.println("Mew-chirik");
    }
}
