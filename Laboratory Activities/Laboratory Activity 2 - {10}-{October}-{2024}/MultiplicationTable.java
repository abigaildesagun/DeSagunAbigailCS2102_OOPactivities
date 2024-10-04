import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size=input.nextInt();

        int [][] multiplicationTable=populateArray(size);

        System.out.println("Multiplication Table:");
        for(int r=0; r<size; r++){
            for(int c=0; c<size; c++){
                System.out.printf("%4d", multiplicationTable[r][c]);
            }
            System.out.println();
        }
        input.close();
    }

    public static int[][] populateArray (int size){
        int arr [][] = new int [size][size];

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                arr[i][j]=(i+1)*(j+1);
            }
        }
        return arr;
    }
}
