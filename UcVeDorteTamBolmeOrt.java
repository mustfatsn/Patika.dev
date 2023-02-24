package deneme1;
import java.util.Scanner;
public class UcVeDorteTamBolmeOrt {

	public static void main(String[] args) {
		int k , y=0 , x = 0;
		double s ;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Bir Sayı Giriniz :");
		k = inp.nextInt();
		
		for (int i=1; i <= k ; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				x += i;
				y++;
			}
		}
           s = x / y ;    
		System.out.println("Sonuç: " + s);
	}
}
