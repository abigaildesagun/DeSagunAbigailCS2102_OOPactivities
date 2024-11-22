package Artists;
public class Artist {
    private String name, specialty;
    private int age;

    public Artist (String name, int age, String specialty) {
        this.name=name;
        this.age=age;
        this.specialty=specialty;
    }

    public void printDetails(){
        System.out.println("Artist Name: " + name + "\nAge: " + age + "\nSpecialty: " + specialty);
    }
}
