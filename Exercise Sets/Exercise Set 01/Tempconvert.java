import java.util.*;
public class Tempconvert {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.print("Enter a Celsius value: ");
        int celVal=input.nextInt();
        double celValDouble=(double) celVal;
        System.out.println(String.format("%.2f", celValDouble) + " Celsius is " + String.format("%.2f", fahrenheitconversion(celValDouble))+ " Fahrenheit");
    }

    public static double fahrenheitconversion(double celValDouble) {
        double fahrenheit=(celValDouble*9/5)+(32);
        return fahrenheit;
    }
}
