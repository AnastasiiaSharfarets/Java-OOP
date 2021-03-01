public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Vodka", 100, 40);
        Ingredient tomateJuice = new Ingredient("Tomate juice", 100, 0);
        Ingredient cola = new Ingredient("Cola", 100, 0);
        Ingredient energiser = new Ingredient("Red Bull", 100, 0);

        Cocktail bloodyMary = new Cocktail("Bloody Mary", vodka, tomateJuice);
        Cocktail disco = new Cocktail("Disco", energiser, cola);
       // Cocktail  = new Cocktail("Bloody Mary", vodka, tomateJuice);

    }
}
