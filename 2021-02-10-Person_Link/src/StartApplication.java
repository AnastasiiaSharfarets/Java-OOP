public class StartApplication {
    public static void main(String[] args) {
        //SinglePageApp
        Person p1 = new Person("Olya", 12, "2323k1");
        Person p2 = new Person("Angela", 65, "12132k000");
        Person p3 = new Person("Alex", 40, "340-34h");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        Person p4 = p1;
        p4.firstName = "Anna";
        System.out.println(p4.firstName);//имя поменяется, потому р4 - это ссылка
        //ссылочные данные, new -это данные оригинала
        System.out.println(p4);

        Person p5 = new Person();
        p5 = p1;
        p5.firstName = "Sweta";
        System.out.println(p1.firstName);

    }
}
