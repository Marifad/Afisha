public class Manager {

    private Movie[] movies = new Movie[0];
    int lastMovies;

    public Manager() {
        lastMovies = 10;
    }

    public Manager(int lastMovies) {
        this.lastMovies = lastMovies;
    }


    public void add(Movie item) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {

        int resultLength;
        if (movies.length < lastMovies) {
            resultLength = movies.length;
        } else {
            resultLength = lastMovies;
        }

        Movie[] tmp = new Movie[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }
}
