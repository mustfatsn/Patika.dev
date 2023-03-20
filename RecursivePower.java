package Patika;
import java.util.Scanner;
public class RecursivePower {
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        int a , b;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Taban Değeri Giriniz: ");
            a = inp.nextInt();
            System.out.print("Üs Değeri Giriniz: ");
            b = inp.nextInt();

            System.out.println("Sonuç: " + power(a,b));
        }while (a != 0);
    }
}
