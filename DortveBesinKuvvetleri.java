package deneme1;
import java.util.Scanner;
public class DortveBesinKuvvetleri {

	public static void main(String[] args) {
		int x ;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sınır Sayısı Giriniz :");
		x = inp.nextInt();
		System.out.println("Dört Sayısının Katları");
		for (int i = 1 ; i<=x ; i*=4 ) {
			System.out.println(i);
		}
		System.out.println("Beş Sayısının Katları");
		for (int z = 1 ; z<=x ; z*=5 ) {
			System.out.println(z);
		}
	}
}
