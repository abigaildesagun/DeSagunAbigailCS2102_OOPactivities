import java.util.Scanner;
class Car {
    private String color;
    private double price;
    private char size;

    //constructor
    public Car(String color, double price, char size){
        this.color=color;
        this.price=price;
        this.size=Character.toUpperCase(size);
    }

    //getters
    public String getColor() {
        return color;
    }

    public double getPrice(){
        return price;
    }

    public char getSize(){
        return size;
    }

    //setters
    public void setColor(String color){
        this.color=color;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setSize(char size){
        this.size=Character.toUpperCase(size);
    }

    //toStr
    public String toString(){
        String sizeDescriptor;
        switch (size) {
            case 'S':
                sizeDescriptor="small";
                break;
            case 'M':
                sizeDescriptor="medium";
                break;
            case 'L':
                sizeDescriptor="large";
                break;
            default:
                sizeDescriptor="unknown";
                break;
        }
        return "Car (" + color.toLowerCase() + ") - P" + String.format("%.2f", price) + " - " + sizeDescriptor;
    }


}

public class CarInformationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the car's color: ");
        String carColor = input.nextLine();
        System.out.print("Enter the car's price: ");
        double carPrice = input.nextDouble();
        System.out.print("Enter the car's size (Small, Medium, or Large): ");
        String carStrSize = input.next().toUpperCase();
        char carSize = carStrSize.charAt(0);

        Car car = new Car(carColor, carPrice, carSize);

        System.out.println("-------------------------------------");
        System.out.println("COLLECTED DATA");
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: " + String.format("%.2f", car.getPrice()));
        System.out.println("Size: " + car.getSize());
        System.out.println("-------------------------------------");
        System.out.println(car);
        System.out.println("-------------------------------------");

        input.close();
    }
}