package deneme1;
import java.util.Scanner;
public class DordunKatlariToplami {

	public static void main(String[] args) {
		int n;
		int total = 0;
		Scanner inp = new Scanner(System.in);
		
		do {
			System.out.print("Bir sayı giriniz:");
			n = inp.nextInt();
			if (n % 2 == 0 || n % 4 == 0) {
				total += n ;
			}
		} while (n > 0 && n % 2 == 0);
		System.out.println("Sonuç: " + total);
	}

}
