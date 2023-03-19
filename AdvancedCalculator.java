package Patika;
import java.util.Scanner;
public class AdvancedCalculator {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static int divied(int a, int b){
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }

    static int power(int a, int b){
        int result = 1;
        for (int i=1; i <= b; i++){
            result *= a ;
        }
        return result;
    }

    static int mod(int a, int b){
        int result = a % b;
        System.out.println("Mod İşlemi : " + result);
        return result;
    }

    static void calc(int a, int b){
        System.out.println("Çevresi: " + (2*(a+b)));
        System.out.println("Alanı : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Mod Alma Hesaplama\n" +
                "7-Dikdörtgen Alan ve Çevre Hesaplama\n" +
                "0-Çıkış Yap";

        while (true){
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz: ");
            select = inp.nextInt();

            if (select == 0){
                break;
            }

            System.out.print("İlk Sayı: ");
            int a = inp.nextInt();
            System.out.print("İkincı Sayı: ");
            int b = inp.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if (divied(a,b) == 0){
                        System.out.println("İkinci Sayı 0'dan Farklı Olmalı");
                    }
                    break;
                case 5:
                    System.out.println("Üs Hesabı: " + power(a,b));
                   break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz İşlem Girdiniz!");
            }
        }
    }
}
