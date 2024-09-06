import java.util.Scanner;
public class GettingGreater {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.println("Getting the Greater Value");
        System.out.print("Enter the first character: ");
        char ch1=input.next().charAt(0);
        System.out.print("Enter second character: ");
        char ch2=input.next().charAt(0);

        int ch1Ascii= (int) ch1;
        int ch2Ascii= (int) ch2;
        char greaterVal= (char) Math.max(ch1Ascii, ch2Ascii);

        System.out.println("-----------------------");
        System.out.println("The character with greater value is: " + greaterVal);
        System.out.println("-----------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(ch1 + " : " + ch1Ascii);
        System.out.println(ch2 + " : " + ch2Ascii);

        input.close();
    }
}
