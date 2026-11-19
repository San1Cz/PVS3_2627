package vlastni.examy;
//Doplnte atributy pro Film
//
//Jsou jimi:
//Název filmu,
//Rok vydani,
//rating (4.5, 7.8... vyssi = lepsi)
//doba trvani ve vterinach
//
//Vypis do konzole:
//Vypsano serazene dle data vydani od nejstarsich
//Vypsano serazeno dle jmena
//TOP 10 filmu dle ratingu


import fileworks.DataImport;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Link na odevzdani GIST:
//https://forms.cloud.microsoft/Pages/ResponsePage.aspx?id=f_BDFfkwekCetYp67EGP_1pSNPXTVBFPg7PGychWGEdUM040WFhKVFpJQ1RBUVZYVUU2MUYxS0hETCQlQCNjPTEu
public class MovieComparing {
    static void printList(ArrayList<Movie> items){
        for (Movie i : items){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DataImport di = new DataImport("data/Movies.txt");
        ArrayList<Movie> movies = new ArrayList<>();
        while(di.hasNext()){
            String line = di.readLine();
            String[] data = line.split(";");

            Movie movie = new Movie(
                    data[0],
                    Integer.parseInt(data[1]),
                    Double.parseDouble(data[2]),
                    Long.parseLong(data[3])
            );
            movies.add(movie);
        }
        //podle data vydani
        movies.sort(Movie.BY_YEAR);
        printList(movies);
        Collections.shuffle(movies);
        //podle jmena
        Collections.sort(movies);
        printList(movies);
        //top 10 nejlepsich podle ratingu
        Collections.shuffle(movies);
        movies.sort(Movie.BY_RATING.reversed());
        for (int i = 0; i < 10; i++) {
            System.out.println(movies.get(i));
        }

}
static class Movie implements Comparable<Movie> {
String name;
int year;
double rating;
long duration;

    public Movie(String name, int year, double rating, long duration) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.duration = duration;
    }

    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.name);
    }
    public static final Comparator<Movie> BY_YEAR = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return Integer.compare(o1.year,o2.year);
        }
    };
    public static final Comparator<Movie> BY_RATING = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return Double.compare(o1.rating,o2.rating);
        }
    };


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", duration=" + duration +
                '}';
    }
}}