public class Test {
    public static void main(String[] args) {
        Movie movie1 = new Movie(
                "Титаник",
                "Кэмерон",
                "Хороший",
                "мелодрама",
                200,
                2_000_000);
        //System.out.println(movie1.toDisplay());
        Movie movie2 = new Movie(
                "Гарри Поттер",
                "НеКэмерон",
                "Очень хороший",
                "детский",
                180,
                300_000

        );

        Movie[] netflix = new Movie[]{movie1,movie2};
        Movie.movieArrayGenreToDisplay(netflix,"детский");
        //Movie.movieArrayGenreToDisplay(amazonprime,"ужасы");

    }
}
