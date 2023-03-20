package Patika;
import java.util.Scanner;

public class RecursiveWithPrime {
    
    static int prime(int a){
        int result = a;
        boolean isPrime = true;
        for (int j = 2; j <= result / 2; j++){
            if (result % j == 0){
                isPrime = false;
                System.out.println(result + " Sayısı Asal Değildir.");
                break;
            }
        }if (isPrime == true){
            System.out.println(result + " Sayısı Asaldır.");
        }
        return result;
    }

    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            a = inp.nextInt();

            prime(a);

        }while (a != 1);
    }
}
