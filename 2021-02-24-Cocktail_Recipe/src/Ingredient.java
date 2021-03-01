public class Ingredient {
    public String toString;
    private String title;
    private int liquid; // в мл
    private int perCent;
    private boolean alcohol;

    public Ingredient(String title, int liquid, int perCent) {
        this.title = title;
        this.liquid = liquid;
        this.perCent = perCent;
        setAlcohol();
    }

    public int getLiquid() {
        return liquid;
    }

    public int getPerCent() {
        return perCent;
    }

    public void setAlcohol() {
        if (perCent > 2) {
            alcohol = true;
        }
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "title='" + title + '\'' +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                ", alcohol=" + alcohol +
                '}';
    }
}
