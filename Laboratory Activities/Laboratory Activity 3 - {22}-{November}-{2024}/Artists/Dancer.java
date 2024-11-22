package Artists;
enum DanceStyle{
        BALLET, HIPHOP, JAZZ, CONTEMPORARY
    }

public class Dancer extends Artist{
    private DanceStyle danceStyle;

    public Dancer (String name, int age, DanceStyle danceStyle){
        super(name, age, "Dance");
        this.danceStyle=danceStyle;
    }

    public DanceStyle getDanceStyle() {
        return danceStyle;
    }

    public void setDanceStyle(DanceStyle danceStyle) {
        this.danceStyle = danceStyle;
    }

    @Override
    public void printDetails() {
        System.out.println("Dancer's Info:");
        super.printDetails();
        System.out.println("Dance style: " + danceStyle);
    }
}
