package Patika;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++){
            boolean prime = true;

            for (int j = 2; j <= i / 2; j++){
                if (i % j == 0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.print(i + " ");
            }
        }
    }
}
