import java.util.*;
public class Escseq {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<6; i++){
            sum+=7;
            if (i%2==0) {
                System.out.println("\t" + sum);
            }
            else{
                System.out.println(sum);
            }
        }
    }
}
