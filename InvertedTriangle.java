package Patika;
import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("N Sayısını Giriniz: ");
        n = inp.nextInt();
        
        for (int i=n; i>=1; i--){
            for (int j=(n-i); j>=0; j--){
                System.out.print(" ");
            }for (int k=(2*i)-1; k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
