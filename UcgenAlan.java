package deneme1;
import java.util.Scanner;

public class UcgenAlan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a , b , c ;
		double u , x ;
		
		System.out.print("1.Kenarı Giriniz :");
		a = input.nextInt();
		System.out.print("2.Kenarı Giriniz :");
	    b = input.nextInt();
	    System.out.print("3.Kenarı Giriniz :");
	    c = input.nextInt();
	    
	    u = (a + b + c) / 2;
	    System.out.println("Üçgenin Çevresi :" + (u * 2) );
	    
	    x = Math.sqrt( u*(u-a)*(u-b)*(u-c) );
	    System.out.println("Üçgenin Alanı :" + x );
	
	}

}
