package deneme1;
import java.util.Iterator;
import java.util.Scanner;

public class DiamondWithStars {

	public static void main(String[] args) {
		int i=1;
		Scanner inp = new Scanner(System.in);
		System.out.print("Basamak Sayısını Giriniz :");
		int n = inp.nextInt();
		while (i <= n) {
			        int k = 1;
			        while (k <= (n - i)) {
			    	System.out.print(" ");
			    	k++;
			    }
			    int j = 1 ;
			    while (j <= (2 * i) - 1) {
					System.out.print("*");
					j++;
				}
		    System.out.println();
			i++;
		}
		for (int x = (n-1); x >= 1; x--) {
			for (int y = 1; y <= (n-x); y++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= (2*x)-1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
