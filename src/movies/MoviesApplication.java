package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Welcome to the Movies App!");

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - Add a new movie");

            int choice = input.getInt(0, 6);

            switch (choice) {
                case 0:
                    System.out.println("Exiting the Movies App. Goodbye!");
                    return; // Exit the program
                case 1:
                    viewAllMovies();
                    break;
                case 2:
                    viewMoviesByCategory("animated");
                    break;
                case 3:
                    viewMoviesByCategory("drama");
                    break;
                case 4:
                    viewMoviesByCategory("horror");
                    break;
                case 5:
                    viewMoviesByCategory("scifi");
                    break;
                case 6:
                    addNewMovie();
                    break;
            }
        }
    }

    public static void viewAllMovies() {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("All Movies:");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void viewMoviesByCategory(String category) {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("Movies in the " + category + " category:");
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void addNewMovie() {
        Input input = new Input();

        System.out.println("Enter the name of the new movie:");
        String name = input.getString();

        System.out.println("Enter the category of the new movie:");
        String category = input.getString();

        Movie newMovie = new Movie(name, category);

        System.out.println("New movie added: " + newMovie.getName() + " -- " + newMovie.getCategory());
    }
}


