package Artists;
enum Genre {
        POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
    }

public class Singer extends Artist{
    private Genre genre;

    public Singer (String name, int age, Genre genre){
        super(name, age, "Music");
        this.genre=genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void printDetails() {
        System.out.println("Singer's Info:");
        super.printDetails();
        System.out.println("Genre: " + genre);
    }
}
