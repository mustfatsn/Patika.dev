package deneme1;
import java.util.Scanner;

public class HavaSicakligi {

	public static void main(String[] args) {
		
		int heat ;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Hava Sıcaklığını Giriniz :");
		heat = inp.nextInt();
		
		if ( heat < 5 ) {
			System.out.println("Kayak Yapabilirsiniz.");
		}
		else if ( heat <= 25 ) {
			
			if ( heat <= 15) {
				System.out.println("Sinemaya Gidebilirsiniz.");
			}
			if ( heat >= 10 ) {
				System.out.println("Pikniğe Gidebilirsiniz.");
			}
		}
		else {
			System.out.println("Yüzmeye Gidebilirsiniz.");
		}
	
	}

}
