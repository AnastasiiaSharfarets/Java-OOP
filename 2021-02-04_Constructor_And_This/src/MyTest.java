public class MyTest {
    public static void main(String[] args) {
        Article art1 = new Article(
                "City",
                "Hello"
        );
        Article art2 = new Article(
                "what",
                "who");
        System.out.println(art1.title);
        System.out.println(art2.announce);
        //создали новый конструктор с параметрами

        Article art3 = new Article(
                1,
                "VIA",
                "Zorro");

    }

}
