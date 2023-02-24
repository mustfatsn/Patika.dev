package deneme1;
import java.util.Scanner;
public class Combination {

	public static void main(String[] args) {
		
		// C(n,r) = n! / (r! * (n-r)!)
         int c , n , r , a , total1 = 1 , total2 = 1 , total3 = 1;
         
         Scanner inp = new Scanner(System.in);
         System.out.println("Kombinasyon Hesaplama (N,R)");
         System.out.print("N Sayısını Girin :");
         n = inp.nextInt();
         System.out.print("R Sayısını Girin :");
         r = inp.nextInt();
         a = n - r ;
         
			for (int x = 1; x <= n ; x++ ) {
				total1 = total1 * x ;
			}
			for (int y = 1; y <= r ; y++) {
				total2 = total2 * y ;
			}
			for (int z = 1; z <=a ; z++) {
				total3 = total3 * z ;
			}
			c = total1 / (total2 * total3);
	        System.out.println("Kombinasyon Sonucu: " + c);
	}  
}
