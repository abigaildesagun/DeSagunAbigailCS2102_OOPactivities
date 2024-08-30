import java.util.*;
public class Tempconvert {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.print("Enter a Celsius value: ");
        int celVal=input.nextInt();
        System.out.println(celVal + " Celsius is " + String.format("%.2f", fahrenheitconversion(celVal)) + " Fahrenheit");
    }

    public static double fahrenheitconversion(int celVal) {
        double fahrenheit=(celVal*9/5)+(32);
        return fahrenheit;
    }
}
