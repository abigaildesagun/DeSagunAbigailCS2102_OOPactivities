package Artists;
public class Artist {
    private String name, specialty;
    private int age;

    public Artist (String name, int age, String specialty) {
        this.name=name;
        this.age=age;
        this.specialty=specialty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void printDetails(){
        System.out.println("Artist Name: " + name + "\nAge: " + age + "\nSpecialty: " + specialty);
    }
}
