package MidTerm1;

public class Movie {
    // Fields
    String title;
    String director;
    int duration;

    // Default constructor
    public Movie() {
        this.title = "Unknown";
        this.director = "Unknown";
        this.duration = 0;
    }

    // Constructor with title only
    public Movie(String title) {
        this.title = title;
        this.director = "Unknown";
        this.duration = 0;
    }

    // Constructor with all values
    public Movie(String title, String director, int duration) {
        this.title = title  ;
        this.director = director;
        this.duration = duration;
    }

    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("---------------------------");
    }

    // Main method to test the Movie class
    public static void main(String[] args) {
        Movie m1 = new Movie(); // default constructor
        Movie m2 = new Movie("Inception"); // title-only constructor
        Movie m3 = new Movie("TITANIC", "James Cameron",
                194 ); // all-values constructor

        // Display movie details
        m1.display();
        m2.display();
        m3.display();

    }
}

