package Patika;
import java.util.Scanner;
public class MaxMinValue {
    public static void main(String[] args) {
        int n, a, max, min;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Giriceksiniz: ");
        n = inp.nextInt();
        System.out.print("1.Sayıyı Giriniz :");
        a = inp.nextInt();
           max = a;
           min = a;

           for (int i = 2; i <= n; i++) {
               System.out.print(i + ".Sayıyı Giriniz: ");
               a = inp.nextInt();
               if (a > max) {
                   max = a;
               }
               if (a < min) {
                   min = a;
               }
           }
        System.out.println("En Büyük Sayı: " + max);
        System.out.println("En Küçük Sayı: " + min);
    }
}
