public class Main {

    public static void main(String[] args) {

        Movie actionMovie = new Movie(9.90,"13.05.2019", "20:00", "Avengers", 2);
        Movie romanticMovie = new Movie(9.90,"14.05.2019", "19:30", "Love", 3);
        Movie teenWolf = new Movie(9.99,"15.05.2019", "19:30", "Teenwolf", 3);
        Movie spiderMan = new Movie (20.20, "25", "20:21", "Spiderman", 2 );

        Movie[] theMovies = {
                actionMovie,
                romanticMovie,
                teenWolf,
                spiderMan
        };

        for (int i=0; i < theMovies.length; i++) {

            theMovies[3].printAllData();
        }


    }
}
