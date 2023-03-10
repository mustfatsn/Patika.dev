package Patika;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i < n; i++){
            if (n % i == 0){
                total += i;
            }
        }
        if (total == n) {
            System.out.println(n + " Mükemmel Bir Sayıdır.");
        }else{
            System.out.println(n + " Mükemmel Bir Sayı Değildir.");
        }
    }
}
