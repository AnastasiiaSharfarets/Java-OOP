public class Starter {
    public static void main(String[] args) {
        cocktailIntro();
        Ingredient vodka = new Ingredient("Vodka", 100, 40);
        Ingredient energiser = new Ingredient("Red Bull", 100, 0);
        Cocktail disko = new Cocktail("Диско", energiser, vodka);

        Almanach best100CocktailsInTheWorld = new Almanach(100);
        best100CocktailsInTheWorld.addCocktail(disko);
    }
    private static void cocktailIntro(){
        Ingredient vodka = new Ingredient("Vodka", 100, 40);
        Ingredient tomateJuice = new Ingredient("Tomate juice", 100, 0);
        Ingredient cola = new Ingredient("Cola", 100, 0);
        Ingredient energiser = new Ingredient("Red Bull", 100, 0);
        Cocktail bloodyMary = new Cocktail("Bloody Mary", vodka, tomateJuice);
        Cocktail disco = new Cocktail("Disco", energiser, cola);
        Cocktail berlinNull = new Cocktail("Нулёвочка", cola, energiser);
        System.out.println(disco);

        System.out.println("----------------");

        System.out.println(berlinNull);
    }
}
