

// 100 best cocktails of the world
public class Almanach {
    private Cocktail[] cocktails;
    private int size;//number in book

    public Almanach(int capacity) {
        cocktails = new Cocktail[capacity];
        size = 0;
    }

    //CRUD - create,read, update, delete

    public boolean addCocktail(Cocktail cocktail) {
        if (size < cocktails.length) {
            cocktails[size] = cocktail;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteCocktail(Cocktail cocktail) {
        for (int i = 0; i < size; i++) {
            if (cocktails[i].getTitle().equals(cocktail.getTitle())) {
                cocktails[i] = cocktails[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean update(Cocktail oldDrink, Cocktail newDrink) {
        for (int i = 0; i < size; i++) {
            //мы по тайтлам проверяем соответсвие коктейлей
            if (cocktails[i].getTitle().equals(oldDrink.getTitle())) {
                cocktails[i] = newDrink;
                return true;
            }
        }
        return false;
    }

    public String updateForPeople(Cocktail oldDrink, Cocktail newDrink){
        if(update(oldDrink,newDrink)){
            return  "Апдейт прошёл успешно";
        }
        return "опять ничего не получилось";
    }

    @Override
    public String toString() {
        // дописать тустринг для альманаха используя Коктейль.геттайтл или Коктейль тустринг.
        return "В нашем альманахе уже " + size + " страниц. \n";
    }
}
