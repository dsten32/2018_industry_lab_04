package ictgradschool.industry.arrays.movies;

public class MovieProgram {
    public void start() {
        
        //  Step 1. Modify this line to construct an array of 19 Movie objects, called "films".
        Movie[] films = new Movie[19];
        
        fillMoviesArray(films);                
        printMoviesArray(films);        
        
        Movie mostRecentMovie = getMostRecentMovie(films);
        Movie longestMovie = getLongestMovie(films);
//
        printResults(mostRecentMovie, longestMovie);//
        System.out.println();
        
        printDirector("Searching for Sugar Man", films);
        printDirector("Liberal Arts", films);
        printDirector("The Intouchables", films);

    }
    
    private void fillMoviesArray(Movie[] films) {
        films[17] = new Movie("The Intouchables",2011,112,"Olivier Nakache and Eric Toledano");
        films[6] = new Movie("From Russia With Love",1963,110,"Terence Young");
        films[14] = new Movie("The Long Voyage Home",1940,105,"John Ford");
        films[9] = new Movie("Easy Rider",1969,94,"Dennis Hopper");
        films[3] = new Movie("Dark Shadows",2012,113,"Tim Burton");
        films[10] = new Movie("Walk the Line",2005,136,"James Mangold");
        films[5] = new Movie("The Help",2011,137,"Tate Taylor");
        films[0] = new Movie("Meet the Parents",2000,107,"Jay Roach");
        films[7] = new Movie("The King's Speech",2011,118,"Tom Hooper");   
        films[8] = new Movie("Charlie and the Chocolate Factory",2005,115,"Tim Burton");
        films[2] = new Movie("Alice In Wonderland",2009,109,"Tim Burton");
        films[4] = new Movie("The Iron Lady",2011,105,"Phylliday Lloyd");
        films[11] = new Movie("Kaikohe Demolition",2004,52,"Florian Habicht");
        films[12] = new Movie("Brokeback Mountain",2005,134,"Ang Lee");
        films[13] = new Movie("Gladiator",2000,154,"Ridley Scott");
        films[1] = new Movie("The Parent Trap",1961,129,"David Swift");
        films[15] = new Movie("Happy-Go-Lucky",2008,118,"Mike Leigh");
        films[16] = new Movie("The Big Wedding",2013,89,"Justin Zackham");
        films[18] = new Movie("Searching for Sugar Man",2012,86,"Malik Bendjelloul");
    }

    
    private void printMoviesArray(Movie[] films) {
        System.out.println("Movie Collection");
        System.out.println("================");
        //  Step 2.  Complete the printMoviesArray() method
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i]);
        }

    }
    
    
    private Movie getMostRecentMovie(Movie[] films) {
        // Step 3.  Complete the getMostRecentMovie() method.
        Movie mostRecent = films[0];

//        for (int i = 0; i < films.length; i++) {
//            mostRecent=films[i];
                for (int j=1;j<films.length;j++){
                    if (!mostRecent.isMoreRecentThan(films[j])) {
                        mostRecent = films[j];
                    }
                }
//
//        }
        return mostRecent;
    }
    
    private Movie getLongestMovie(Movie[] movies) {
        //  Step 4.  Complete the getLongest() method.
        Movie longest = movies[0];
        for (int j=1;j<movies.length;j++){
            if (!longest.isLongerThan(movies[j])) {
                longest = movies[j];
            }
        }
        return longest;
    }
    
    private void printResults(Movie mostRecent, Movie longest) {
        System.out.println();
        System.out.println("The most recent movie is: " + mostRecent.toString());
        System.out.println("The longest movie is: " + longest.toString());
    }
    
    private void printDirector(String movieName, Movie[] movies) {
        //  Step 5. Complete the printDirector() method
        String directedBy=movieName + " is not in the collection.";
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getName() == movieName){
                directedBy = movieName + " was directed by " + movies[i].getDirector();
            }
        }
        System.out.println(directedBy);
    }

    public static void main(String[] args) {
        new MovieProgram().start();
    }

}
