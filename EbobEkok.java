package Patika;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
         int n1 , n2 , i , k;
         Scanner inp = new Scanner(System.in);
         System.out.print("n1 Sayısını Giriniz :");
         n1 = inp.nextInt();
         System.out.print("n2 Sayısını Giriniz: ");
         n2 = inp.nextInt();
         /*
         int ebob = 1;
         for (int k = n1; k >= 1; k--){
            if (n1 % k == 0 && n2 % k == 0){
                ebob = k;
                System.out.println("Ebob :" + ebob);
                break;
            }
         }
         for (int i = n1; i <= (n1 * n2); i++){
             if (i % n1 == 0 && i % n2 == 0){
                 System.out.println("Ekok :" + i);
                 break;
             }
         }
        System.out.println("Ekok(2):" + (n1*n2) / ebob);
        */
        i = n1;
        while (i >= 1 ){
            if (n1 % i == 0 && n2 % i == 0){
                System.out.println("Ebob :" + i);
                break;
            }
            i--;
        }
        k = 1;
        while (k <= (n1 * n2)){
            if (k % n1 == 0 && k % n2 == 0 ){
                System.out.println("Ekok :" + k);
                break;
            }
            k++;
        }
        System.out.println("Ekok(2) :" + (n1*n2) / i );
    }
}
