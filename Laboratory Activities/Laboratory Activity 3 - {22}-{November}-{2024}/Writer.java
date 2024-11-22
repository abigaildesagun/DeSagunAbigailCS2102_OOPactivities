package Artists;
enum WritingStyle {
    FICTION, NONFICTION, POETRY, DRAMA
}

public class Writer extends Artist{
    private WritingStyle writingStyle;

    public Writer (String name, int age, WritingStyle writingStyle){
        super(name, age, "Literature");
        this.writingStyle=writingStyle;
    }

    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    public void setWritingStyle(WritingStyle writingStyle) {
        this.writingStyle = writingStyle;
    }

    @Override
    public void printDetails() {
        System.out.println("Writer's Info:");
        super.printDetails();
        System.out.println("Writing style: " + writingStyle);
    }
    
}