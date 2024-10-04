import java.util.Scanner;
public class GetArrayMean {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.print("Enter number of elements: ");
        int elNum = input.nextInt();

        int[] arr = new int[elNum];

        for (int i=0; i<elNum; i++){
            System.out.print("Enter number: ");
            int num=input.nextInt();
            arr[i]=num;
        }

        System.out.println("Mean of array is: " + String.format("%.2f",getArrayMean(arr, elNum)));

        input.close();
    }

    public static double getArrayMean (int [] arr, int elNum){
        int sum=0;

        for (int i=0; i<elNum; i++){
            sum+=arr[i];
        }

        double mean = (double) sum/elNum;
        return mean;
    }
}
