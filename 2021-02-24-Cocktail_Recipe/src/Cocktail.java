import java.util.Arrays;

public class Cocktail {
    private String title;
    private Ingredient[] ingredients;
    private int liquid; // в мл
    private int perCent;//

    public Cocktail(String title, Ingredient... ingredients) {// variable arguments ...
        this.title = title;
        this.ingredients = ingredients;
        setLiquid();
        setPerCent();
    }

    public String getTitle() {
        return title;
    }

    private void setPerCent() {
        //итоговые проценты  =  мл * алкоголь + мл
        // (100*0% + 100мл*40%)/  все мл = итоговая крепость коклейлях
        int result = 0;
        for (int i = 0; i < ingredients.length; i++) {
            result += ingredients[i].getPerCent() * ingredients[i].getLiquid();
        }
        perCent = result / getLiquid();
    }

    public int getLiquid() {
        return liquid;
    }

    public void setPerCent(int perCent) {
        this.perCent = perCent;
    }

    private void setLiquid() {
        int result = 0;
        for (Ingredient ing : ingredients) {//ing -отдельный ингридиент
            result += ing.getLiquid();
        }
        liquid = result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < ingredients.length; i++) {
            result += ingredients[i].toString;
        }
        return "Cocktail{" +
                "title='" + title + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                "consists of " +
                '}';
    }
}
