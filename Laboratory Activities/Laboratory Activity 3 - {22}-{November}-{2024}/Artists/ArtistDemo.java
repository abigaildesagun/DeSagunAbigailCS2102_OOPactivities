package Artists;
public class ArtistDemo {
    public static void main(String[] args) {

        Artist artist = new Artist("Lana del Rey", 39, "Music");
        artist.printDetails();

        System.out.println();
        Singer singer = new Singer("Kanye West", 47, Genre.HIPHOP);
        singer.printDetails();
        
        System.out.println();
        Dancer dancer = new Dancer("Elle Fanning", 26, DanceStyle.BALLET);
        dancer.printDetails();

        System.out.println();
        Painter painter = new Painter("John Everett Millais", 67, Medium.OIL);
        painter.printDetails();

        System.out.println();
        Writer writer = new Writer("Ottessa Moshfegh", 43, WritingStyle.FICTION);
        writer.printDetails();
    }
}