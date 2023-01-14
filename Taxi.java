package deneme1;
import java.util.Scanner;
public class Taxi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int km , acilis;
		double kmbasina , x , tutar ;
		kmbasina = 2.20 ;
		acilis = 10 ;
		
		System.out.print("KM Giriniz :");
		km = input.nextInt();
		
		x = acilis + ( km * kmbasina );
		tutar = x <= 20 ? 20 : x;
		System.out.print("Tutar :" + tutar );
		
		
	

	
	
	
	}

}
