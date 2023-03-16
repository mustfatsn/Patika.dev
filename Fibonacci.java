package Patika;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n , x = 0, y = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci Serisinin Eleman Sayısını Girin: ");
        n = inp.nextInt();

        for (int i = 1; i <= (n / 2) ; i++){
            System.out.println(x);
            System.out.println(y);
            x += y;
            y += x;
        }
    }
}
