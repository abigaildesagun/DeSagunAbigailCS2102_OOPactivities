package Artists;
enum Medium {
        OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
    }

public class Painter extends Artist{
    public static Object WritingStyle;

    private Medium medium;

    public Painter (String name, int age, Medium medium){
        super(name, age, "Arts");
        this.medium=medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @Override
    public void printDetails() {
        System.out.println("Painter's Info:");
        super.printDetails();
        System.out.println("Medium: " + medium);
    }
}