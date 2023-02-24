package deneme1;
import java.util.Scanner;
public class UsluSayılar {

	public static void main(String[] args) {
		int x , y , total = 1 ;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Üssü Alınacak Sayıyı Girin :");
		x = inp.nextInt();
		System.out.print("Üs Olacak Sayıyı Girin :");
		y = inp.nextInt();
		
		for (int i = 1; i <= y; i++ ) {
			total *= x;			
		}
		System.out.println("Cevap :" + total);
	}

}
