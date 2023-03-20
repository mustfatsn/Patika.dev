package Patika;
import java.util.Scanner;
public class CreatingMethodsbyPattern {

    static void patternReduction(int a){
        if (a > 0) {
            System.out.print(a + " ");
            patternReduction(a - 5);
        }
        System.out.print(a + " ");
    }

    static void patternBoost(int a, int b){
        if ( a <= b ){
            System.out.print(a + " ");
            patternBoost(a+5, b);
        }
    }

    public static void main(String[] args) {
        int a, b;
        Scanner inp = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        a = inp.nextInt();
        b = a;

        System.out.print("Çıktısı: ");
        patternReduction(a);
        patternBoost(a,b);
    }
}
